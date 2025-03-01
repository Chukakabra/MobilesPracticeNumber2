package com.example.timofeevnr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() is here!");
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NewActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() is here!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() is here!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() is here!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() is here!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() is here!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()... is here?");
    }

    public void Jump(View view) {
        Intent intent = new Intent(MainActivity.this, NewActivity.class);
        startActivity(intent);
    }
}