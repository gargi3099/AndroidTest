package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class NameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);
        Intent intent=getIntent();
        String name=intent.getStringExtra("NAME");
        TextView textView=findViewById(R.id.textName);
        textView.setText(name);
    }
}