package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private String TAG  = "TAG";
    private TextView new_text_surname, new_text_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        init();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }
    @Override
    protected void onPause() {
        Log.i(TAG, "onPause");
        super.onPause();
    }
    @Override
    protected void onStart() {
        Log.i(TAG, "onStart");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.i(TAG, "onResume");
        super.onResume();
    }
    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.i(TAG, "onRestart");
        super.onRestart();
    }
    private void init()
    {
        new_text_surname = findViewById(R.id.new_text_surname);
        new_text_name = findViewById(R.id.new_text_name);
        Bundle arguments = getIntent().getExtras();
        if(arguments != null)
        {
            new_text_name.setText(arguments.get("name").toString());
            new_text_surname.setText(arguments.get("surname").toString());
        }

    }
}