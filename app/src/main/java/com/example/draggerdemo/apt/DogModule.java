package com.example.draggerdemo.apt;

import dagger.Module;
import dagger.Provides;

@Module
public class DogModule {
    @Provides
    public Dog providerDog() {
        return new Dog();
    }
}
