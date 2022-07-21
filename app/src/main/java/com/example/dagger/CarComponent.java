package com.example.dagger;

import dagger.Component;

@Component
public interface CarComponent {

    Car getcar();

    void inject(MainActivity mainActivity);
}
