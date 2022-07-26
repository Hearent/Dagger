package com.example.dagger.dagger;

import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component (dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getcar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapasity(@Named("engine capacity") int engineCapasity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}
