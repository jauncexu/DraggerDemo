package com.example.draggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

// 在module 和 component 加Singleton，则表示单例类，局部单例

// 包裹
@Singleton
@Module
public class StudentModule {
    @Singleton
    @Provides // 暴露学生
    public Student getStudent() {
        return new Student();
    }
}
