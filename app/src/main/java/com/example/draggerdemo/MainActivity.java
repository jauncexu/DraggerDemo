package com.example.draggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

public class MainActivity extends AppCompatActivity {

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 方式一
        // DaggerStudentComponent.create().injectMainActivity(this);

        // 方式二
//        DaggerStudentComponent.builder()
//                .studentModule(new StudentModule())
//                .build()
//                .injectMainActivity(this);


        // 全局依赖注入，全局单例
        ((MyApplication) getApplication()).getAppComponent().injectMainActivity(this);

        // module加入Singleton时 则表示局部单例
        Log.w("xjw", student.hashCode() + "__MainActivity");
        Log.w("xjw", student.hashCode() + "__MainActivity");
    }
}