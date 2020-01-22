package com.example.myapp.ch13_5_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 取得TextView元件
        output = (TextView) findViewById(R.id.lblOutput);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        // 判斷觸控事件的手指動作
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                output.setText("手指觸摸螢幕...");
                break;
            case MotionEvent.ACTION_MOVE:
                output.setText("手指在螢幕上移動...");
                break;
            case MotionEvent.ACTION_UP:
                output.setText("手指離開螢幕...");
                break;
        }
        return super.onTouchEvent(event);
    }
}

