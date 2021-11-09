package com.example.draggerdemo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = StudentModule.class)
public interface StudentComponent {
    // 收货地址  用户的地址  注入的来源
    void injectMainActivity(MainActivity activity);

    void injectMainActivity2(MainActivity2 activity);
}
