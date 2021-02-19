package com.mufeez.dagger_example.module;


import com.mufeez.dagger_example.component.Engine;
import com.mufeez.dagger_example.component.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}