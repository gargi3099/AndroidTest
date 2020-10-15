package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class NameDisplay extends AppCompatActivity {

    private String[] namearray={"Gargi","Kriti","Jinal","Shikha","Bhavesh"};
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);
        textView=findViewById(R.id.textName);
        Random random=new Random();
        int r=random.nextInt();
        String name=namearray[r];
        textView.setText(name);
    }
}