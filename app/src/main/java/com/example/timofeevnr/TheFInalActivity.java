package com.example.timofeevnr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TheFInalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_final2);
        Intent intent = getIntent();
        String FIO = intent.getStringExtra("EXTRA_FULL_NAME");
        String Group = intent.getStringExtra("EXTRA_GROUP");
        String Age = intent.getStringExtra("EXTRA_AGE");
        String Grade = intent.getStringExtra("EXTRA_GRADE");
        TextView textView = findViewById(R.id.textView);
        textView.setText("ФИО: " + FIO + "\nНомер группы: " + Group + "\nВозраст: " + Age + "\nЖелаемая оценка: " + Grade);
    }
}