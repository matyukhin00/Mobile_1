package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY = "key";

    public SecondActivity() {
        super(R.layout.second_file);
    }
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view1, SecondFragment.class, null)
                    .commit();
        }
    }*/
}