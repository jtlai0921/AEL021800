package com.example.myapp.ch15_2_1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // 事件處理程序
    public void button_Click(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("關於");  // 標題文字
        // 指定對話方塊訊息文字
        builder.setMessage("版本: 1.0版\n作者: 陳會安");
        // 設定按鈕和事件處理程序
        builder.setPositiveButton("確定", null);
        builder.show();  // 顯示對話方塊
    }
}
