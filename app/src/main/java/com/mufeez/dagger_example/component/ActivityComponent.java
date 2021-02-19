package com.mufeez.dagger_example.component;

import com.mufeez.dagger_example.AppComponent;
import com.mufeez.dagger_example.MainActivity;
import com.mufeez.dagger_example.PerActivity;
import com.mufeez.dagger_example.car.Car;
import com.mufeez.dagger_example.module.PetrolEngineModule;
import com.mufeez.dagger_example.module.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        Builder appComponent(AppComponent component);
        ActivityComponent build();
    }
}