package com.example.dagger.car;

public class Wheels {

    private Tires tires;
    private Rims rims;

    public Wheels(Rims rims, Tires tires) {
        this.tires = tires;
        this.rims = rims;
    }
}
