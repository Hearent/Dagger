package com.example.dagger.dagger;

import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getcar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapasity(@Named("engine capacity") int engineCapasity);

        CarComponent build();
    }
}
