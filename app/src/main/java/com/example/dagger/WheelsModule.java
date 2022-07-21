package com.example.dagger;

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
