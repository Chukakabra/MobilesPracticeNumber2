package com.example.timofeevnr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText FIO = findViewById(R.id.FIO);
                EditText Group = findViewById(R.id.Class);
                EditText Age = findViewById(R.id.Age);
                EditText Grade = findViewById(R.id.Grade);
                Intent intent = new Intent(NewActivity.this, TheFInalActivity.class);
                intent.putExtra("EXTRA_FULL_NAME", FIO.getText().toString());
                intent.putExtra("EXTRA_GROUP", Group.getText().toString());
                intent.putExtra("EXTRA_AGE", Age.getText().toString());
                intent.putExtra("EXTRA_GRADE", Grade.getText().toString());
                startActivity(intent);
            }
        });
    }
}