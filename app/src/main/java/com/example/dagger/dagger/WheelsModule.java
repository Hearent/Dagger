package com.example.dagger.dagger;

import com.example.dagger.car.Rims;
import com.example.dagger.car.Tires;
import com.example.dagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims providesRims(){
        return new Rims();
    }

    @Provides
    static Tires providesTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels prividesWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
