package com.mufeez.dagger_example.car;

import android.util.Log;

import com.mufeez.dagger_example.car.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }
    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}