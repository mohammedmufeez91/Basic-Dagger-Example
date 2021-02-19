package com.mufeez.dagger_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mufeez.dagger_example.car.Car;
import com.mufeez.dagger_example.component.ActivityComponent;

import com.mufeez.dagger_example.component.DaggerActivityComponent;
import com.mufeez.dagger_example.module.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*CarComponent component = DaggerCarComponent.create();
        component.inject(this);
*/

        /*CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();*/

//        CarComponent component = DaggerCarComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build();
//        component.inject(this);
//        car.drive();

        /*CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();*/

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();
        component.inject(this);
        car1.drive();
        car2.drive();

        //car.drive();
    }
}