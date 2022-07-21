package com.example.dagger.dagger;

import com.example.dagger.car.DieselEngine;
import com.example.dagger.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindsEngine (DieselEngine engine);
}
