package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        getArgs();
    }
    private void getArgs() {
        Bundle arg = getIntent().getExtras();
        assert arg != null;
        String name = Objects.requireNonNull(arg.get("key").toString());
        Log.i(MainActivity.TAG, name);
    }
    public void onClick1(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY, "key is here 2");
        setResult(RESULT_OK, intent);
        finish();
    }
}