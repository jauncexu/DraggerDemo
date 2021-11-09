package com.example.draggerdemo.apt;

import com.example.draggerdemo.MainActivity3;

import dagger.Component;

@Component(modules = {DogModule.class})
public interface DogComponent {
    // 注入目标
    void injectMu(MainActivity3 activity);
}
