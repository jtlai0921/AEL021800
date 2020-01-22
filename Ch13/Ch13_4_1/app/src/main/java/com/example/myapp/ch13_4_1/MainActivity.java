package com.example.myapp.ch13_4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // button元件的事件處理方法
    public void button_Click(View view) {
        int c;
        double f;
        // 取得EditText元件
        EditText txtC=(EditText) findViewById(R.id.txtC);
        EditText txtF=(EditText) findViewById(R.id.txtF);
        // 取得輸入值
        c = Integer.parseInt(txtC.getText().toString());
        // 攝氏轉華氏的公式
        f = (9.0 * c) / 5.0 + 32.0;
        txtF.setText(String.valueOf(f));
    }
}