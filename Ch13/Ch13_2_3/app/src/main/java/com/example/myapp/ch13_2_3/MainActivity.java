package com.example.myapp.ch13_2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Ch13_2_3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "ActivityCh13_2_3:onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityCh13_2_3:onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityCh13_2_3:onResume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityCh13_2_3:onStop");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityCh13_2_3:onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityCh13_2_3:onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityCh13_2_3:onDestroy");
    }
}
