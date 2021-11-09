package com.example.draggerdemo;

import android.app.Application;

public class MyApplication extends Application {

    private StudentComponent mStudentComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mStudentComponent = DaggerStudentComponent.builder().studentModule(new StudentModule()).build();
    }

    public StudentComponent getAppComponent() {
        return mStudentComponent;
    }
}
