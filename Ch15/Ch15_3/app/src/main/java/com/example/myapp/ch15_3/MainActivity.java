package com.example.myapp.ch15_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner opSpin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] operators = {"+", "-", "*", "/"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 運算子的Spinner元件
        opSpin = (Spinner) findViewById(R.id.operators);
        // 建立ArrayAdapter接合器物件
        ArrayAdapter<String> a = new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item, operators);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        opSpin.setAdapter(a);  // 指定接合器物件
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
            CheckBox chkDivide;
            // 取得EditText元件
            txtOpd1=(EditText) findViewById(R.id.txtOpd1);
            txtOpd2=(EditText) findViewById(R.id.txtOpd2);
            // 取得輸入值
            opd1 = Integer.parseInt(txtOpd1.getText().toString());
            opd2 = Integer.parseInt(txtOpd2.getText().toString());
            // 取得選取的運算子
            String op = opSpin.getSelectedItem().toString();
            if (op == "+") {
                result = opd1 + opd2;  // 加
            }
            else if (op == "-") {
                result = opd1 - opd2;  // 減
            }
            else if (op == "*") {
                result = opd1 * opd2;  // 乘
            }
            else if (op == "/") {
                chkDivide = (CheckBox) findViewById(R.id.chkDivide);
                if (chkDivide.isChecked())
                    result = opd1 / opd2;  // 整數除法
                else
                    result = opd1 / (double) opd2;
            }
            Toast.makeText(MainActivity.this, "計算結果 = " + result,
                    Toast.LENGTH_SHORT).show();
        }
    };
}
