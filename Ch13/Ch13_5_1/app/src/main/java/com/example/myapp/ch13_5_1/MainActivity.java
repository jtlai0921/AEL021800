package com.example.myapp.ch13_5_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 取得TextView元件
        output = (TextView) findViewById(R.id.lblOutput);
        // 取得Button元件
        Button btn = (Button) findViewById(R.id.button);
        // 註冊傾聽者物件
        btn.setOnClickListener(listener);
        btn.setOnLongClickListener(longListener);
    }
    // 建立長按事件的傾聽者物件
    View.OnLongClickListener longListener =
            new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    output.setText("觸發LongClick事件...");
                    return false; // 觸發LongClick後再觸發Click事件
                    // return true;  // 只觸發LongClick事件
                }
            };
    // 建立Click事件的傾聽者物件
    View.OnClickListener listener =
            new View.OnClickListener() {
                public void onClick(View v) {
                    output.setText("觸發Click事件...");
                }
            };
}

