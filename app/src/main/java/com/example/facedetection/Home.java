package com.example.facedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void changeActivity(View view) {
        Intent intent = new Intent(Home.this, Register.class);
        startActivity(intent);
    }   public void changeActivity2(View view) {
        Intent intent = new Intent(Home.this, Scan.class);
        startActivity(intent);
    }
}