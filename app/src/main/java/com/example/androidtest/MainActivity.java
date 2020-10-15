package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] mnamearray={"Gargi","Kriti","Jinal","Shikha","Bhavesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changename(View view) {
        Random random=new Random();
        int r=random.nextInt(mnamearray.length-1);
        String name=mnamearray[r];
        //int nameresource=getResources().getIdentifier(name,"text",getApplicationContext().getPackageName());
        Intent intent=new Intent(this,NameDisplay.class);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}