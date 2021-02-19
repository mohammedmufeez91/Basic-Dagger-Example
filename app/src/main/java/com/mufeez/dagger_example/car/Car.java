package com.mufeez.dagger_example.car;

import android.util.Log;

import com.mufeez.dagger_example.component.Engine;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private  Driver driver;

    @Inject
    public Car(Engine engine, Wheels wheels,Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver =driver;
    }
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
        Log.d(TAG, driver + " drives " + this);

    }
}