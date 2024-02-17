package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;

import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Приложение создано",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Приложение создано");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Приложение запущено",Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Приложение запущено");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Приложение возобновлено",Toast.LENGTH_SHORT).show();
        Log.w(TAG,"Приложение возобновлено");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Приложение приостановлено",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Приложение приостановлено");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Приложение остановлено",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Приложение остановлено");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Приложение закрыто",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Приложение закрыто");
    }
}