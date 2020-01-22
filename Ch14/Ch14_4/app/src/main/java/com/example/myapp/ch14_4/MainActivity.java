package com.example.myapp.ch14_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int SET_RESULT = 1;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 取得Button元件
        Button btn=(Button) findViewById(R.id.button);
        // 註冊Button的傾聽者物件
        btn.setOnClickListener(btnListener);
        // 取得TextView元件
        output = (TextView) findViewById(R.id.lblOutput);
    }
    View.OnClickListener btnListener =
            new View.OnClickListener() {
                public void onClick(View v) {
                    EditText txtOpd1, txtOpd2;
                    // 取得EditText元件
                    txtOpd1=(EditText) findViewById(R.id.txtOpd1);
                    txtOpd2=(EditText) findViewById(R.id.txtOpd2);
                    // 建立Intent物件
                    Intent intent = new Intent(MainActivity.this, OpActivity.class);
                    // 建立傳遞資料的Bundle物件
                    Bundle bundle = new Bundle();
                    bundle.putString("OPERAND01",txtOpd1.getText().toString());
                    bundle.putString("OPERAND02",txtOpd2.getText().toString());
                    intent.putExtras(bundle);  // 加上資料
                    // 啟動活動且有回傳資料
                    startActivityForResult(intent, SET_RESULT);
                }
            };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case SET_RESULT:
                if (resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    output.setText("計算結果: " + bundle.getDouble("RESULT"));
                }
                break;
        }
    }
}

