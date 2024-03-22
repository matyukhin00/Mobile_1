package com.example.myapplication1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondFragment extends Fragment {
    public SecondFragment() {
        super(R.layout.fragment_second);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView textView = view.findViewById(R.id.TextViewFS2);
        getParentFragmentManager().setFragmentResultListener("Key", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String result = bundle.getString("bundleKey");
                textView.setText(result);
            }
        });

        Button button = view.findViewById(R.id.button_f2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle result = new Bundle();
                //String name = textView.getText().toString();
                result.putString("bundleKey000", "Результат от дочернего фрагмента");
                getParentFragmentManager().setFragmentResult("cfm_key", result);

            }
        });

        return view;
    }
}