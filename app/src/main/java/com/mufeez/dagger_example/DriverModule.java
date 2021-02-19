package com.mufeez.dagger_example;

import com.mufeez.dagger_example.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}