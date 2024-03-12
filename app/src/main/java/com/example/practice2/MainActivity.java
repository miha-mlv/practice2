package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String TAG  = "TAG";
    private Button exit_main_btn1, exit_main_btn2;
    private EditText surname_main, name_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MainActivity", "onCreate");
        setContentView(R.layout.activity_main);
        init();
        exit_main_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Кнопка1 нажата", Toast.LENGTH_SHORT).show();
                Intent mainIntent = new Intent(MainActivity.this, NewActivity.class);
                mainIntent.putExtra("surname", surname_main.getText().toString());
                mainIntent.putExtra("name", name_main.getText().toString());
                startActivity(mainIntent);
            }
        });
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
    public void onNextActivity(View view)
    {
        Toast.makeText(MainActivity.this, "Кнопка2 нажата", Toast.LENGTH_SHORT).show();
        Intent mainIntent = new Intent(MainActivity.this, NewActivity.class);
        mainIntent.putExtra("surname", surname_main.getText().toString());
        mainIntent.putExtra("name", name_main.getText().toString());
        startActivity(mainIntent);
    }
    private void init()
    {
        exit_main_btn1 = findViewById(R.id.exit_btn1_main);
        exit_main_btn2 = findViewById(R.id.exit_btn2_main);
        surname_main = findViewById(R.id.surname_main);
        name_main = findViewById(R.id.name_main);
    }
}