package com.mufeez.dagger_example.module;


import com.mufeez.dagger_example.component.DieselEngine;
import com.mufeez.dagger_example.component.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
/*@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}*/

@Module
public class DieselEngineModule {
    private int horsePower;
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower() {
        return horsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}