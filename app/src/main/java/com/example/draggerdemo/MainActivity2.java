package com.example.draggerdemo;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Inject
    Student student;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);

        ((MyApplication) getApplication()).getAppComponent().injectMainActivity2(this);

        Log.w("xjw", student.hashCode() + "__MainActivity");
        Log.w("xjw", student.hashCode() + "__MainActivity");
    }
}
