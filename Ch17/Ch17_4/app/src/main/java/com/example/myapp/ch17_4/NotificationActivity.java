package com.example.myapp.ch17_4;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        NotificationManager notiMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        // 取消狀態列的提醒訊息
        notiMgr.cancel(getIntent().getExtras().getInt("NOTIFICATION_ID"));
    }
}
