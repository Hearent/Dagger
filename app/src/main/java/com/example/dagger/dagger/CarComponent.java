package com.example.dagger.dagger;

import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getcar();

    void inject(MainActivity mainActivity);
}
