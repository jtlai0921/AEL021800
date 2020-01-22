package com.example.myapp.ch18_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner imgSpin;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] imgFiles = {"image01.png",
                "image02.png", "image03.png",
                "image04.png", "image05.png",
                "image06.png", "image07.png"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 選擇圖檔的Spinner元件
        imgSpin = (Spinner) findViewById(R.id.imgSpin);
        // 建立ArrayAdapter接合器物件
        ArrayAdapter<String> a = new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item, imgFiles);
        imgSpin.setAdapter(a);  // 指定接合器物件
        // 取得ImageView元件
        image=(ImageView) findViewById(R.id.imageView);
        // 取得Button元件
        Button btn = (Button) findViewById(R.id.button);
        // 註冊Button的傾聽者物件
        btn.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View v) {
            // 取得選取的圖檔名稱
            String file = imgSpin.getSelectedItem().toString();
            // 指定ImageView元件顯示的圖檔
            if (file == "image01.png") {
                image.setImageResource(R.mipmap.image01);
            }
            else if (file == "image02.png") {
                image.setImageResource(R.mipmap.image02);
            }
            else if (file == "image03.png") {
                image.setImageResource(R.mipmap.image03);
            }
            else if (file == "image04.png") {
                image.setImageResource(R.mipmap.image04);
            }
            else if (file == "image05.png") {
                image.setImageResource(R.mipmap.image05);
            }
            else if (file == "image06.png") {
                image.setImageResource(R.mipmap.image06);
            }
            else if (file == "image07.png") {
                image.setImageResource(R.mipmap.image07);
            }
        }
    };
}
