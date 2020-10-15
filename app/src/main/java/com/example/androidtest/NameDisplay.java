package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameDisplay extends AppCompatActivity {

    List<String> mnamearray= Arrays.asList("Gargi","Kriti","Jinal","Shikha","Bhavesh");
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);
        Random random=new Random();
        String name=mnamearray.get(random.nextInt(mnamearray.size()));
        textView=(TextView)findViewById(R.id.textName);
        textView.setText(name);
    }
}