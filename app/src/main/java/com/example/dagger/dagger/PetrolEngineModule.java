package com.example.dagger.dagger;

import com.example.dagger.car.Engine;
import com.example.dagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindsEngine (PetrolEngine engine);
}
