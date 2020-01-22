package com.example.myapp.ch17_4;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int NOTIF_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 取得Button元件
        Button btn = (Button) findViewById(R.id.button);
        // 註冊Button的傾聽者物件
        btn.setOnClickListener(btnListener);
    }

    // 建立Button的傾聽者物件
    View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View v) {
            int opd1, opd2;
            double result = 0.0;
            EditText txtOpd1, txtOpd2;
            RadioButton rdbAdd, rdbSubtract, rdbMultiply, rdbDivide;
            CheckBox chkDivide;
            // 取得EditText元件
            txtOpd1 = (EditText) findViewById(R.id.txtOpd1);
            txtOpd2 = (EditText) findViewById(R.id.txtOpd2);
            // 取得輸入值
            opd1 = Integer.parseInt(txtOpd1.getText().toString());
            opd2 = Integer.parseInt(txtOpd2.getText().toString());
            // 取得選取的運算子
            rdbAdd = (RadioButton) findViewById(R.id.rdbAdd);
            if (rdbAdd.isChecked()) {
                result = opd1 + opd2; // 加
            }
            rdbSubtract = (RadioButton) findViewById(R.id.rdbSubtract);
            if (rdbSubtract.isChecked()) {
                result = opd1 - opd2;  // 減
            }
            rdbMultiply = (RadioButton) findViewById(R.id.rdbMultiply);
            if (rdbMultiply.isChecked()) {
                result = opd1 * opd2;  // 乘
            }
            rdbDivide = (RadioButton) findViewById(R.id.rdbDivide);
            chkDivide = (CheckBox) findViewById(R.id.chkDivide);
            if (rdbDivide.isChecked()) {
                if (opd2 == 0) {
                    // 除以0
                    notificationDivideZero();
                    return;
                }
                if (chkDivide.isChecked())
                    result = opd1 / opd2;  // 整數除法
                else
                    result = opd1 / (double) opd2;
            }
            Toast.makeText(MainActivity.this, "計算結果 = " + result,
                    Toast.LENGTH_SHORT).show();
        }
    };
    // 除以0, 就送出通知
    public void notificationDivideZero() {
        // 取得NotificationManager系統服務
        NotificationManager notiMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        // 建立Intent物件
        Intent intent = new Intent(this,  NotificationActivity.class);
        intent.putExtra("NOTIFICATION_ID", NOTIF_ID);
        // 建立PendingIntent物件
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        if (Build.VERSION.SDK_INT >= 26) {  // SDK版本大於26
            String id = "default";  // 頻道編號
            //  建立通知頻道物件
            NotificationChannel channel = new NotificationChannel(id, "預設", NotificationManager.IMPORTANCE_LOW);
            notiMgr.createNotificationChannel(channel);  // 新增頻道
            // 建立狀態列顯示的提醒訊息
            NotificationCompat.Builder noti =
                    new NotificationCompat.Builder(this, id)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle("除以0")
                            .setContentText("除法不能除以0");
            noti.setContentIntent(pIntent);  // 指定PendingIntent
            notiMgr.notify(NOTIF_ID, noti.build());   // 送出提醒訊息
        }
        else {
            // 建立狀態列顯示的提醒訊息
            NotificationCompat.Builder noti =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle("除以0")
                            .setContentText("除法不能除以0");
            noti.setContentIntent(pIntent);  // 指定PendingIntent
            notiMgr.notify(NOTIF_ID, noti.build());   // 送出提醒訊息
        }
    }
}
