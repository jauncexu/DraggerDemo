package com.example.draggerdemo;

import android.os.Bundle;
import android.view.View;

import com.example.draggerdemo.apt.Dog;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    @Inject
    Dog mDog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start(View view) {
    }
}