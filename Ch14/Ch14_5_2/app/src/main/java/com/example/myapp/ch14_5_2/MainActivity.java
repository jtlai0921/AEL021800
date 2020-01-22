package com.example.myapp.ch14_5_2;

import android.content.Intent;
import android.net.Uri;
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
    public void btn1_Click(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.google.com.tw"));
        startActivity(i);
    }
    public void btn2_Click(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:25.04692437135412,121.5161783959678"));
        startActivity(i);
    }
    public void btn3_Click(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:+1234567"));
        startActivity(i);
    }
    public void btn4_Click(View view) {
        Intent i = new Intent(Intent.ACTION_SENDTO,
                Uri.parse("mailto:hueyan@ms2.hinet.net"));
        startActivity(i);
    }
}

