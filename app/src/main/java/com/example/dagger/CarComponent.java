package com.example.dagger;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getcar();

    void inject(MainActivity mainActivity);
}
