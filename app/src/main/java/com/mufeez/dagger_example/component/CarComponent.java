/*
package com.mufeez.dagger_example.component;


import com.mufeez.dagger_example.car.Car;
import com.mufeez.dagger_example.module.DieselEngineModule;
import com.mufeez.dagger_example.MainActivity;
import com.mufeez.dagger_example.module.PetrolEngineModule;
import com.mufeez.dagger_example.module.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    //Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        CarComponent build();
    }
}*/
