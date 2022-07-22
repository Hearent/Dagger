package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapasity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower, @Named("engine capacity") int engineCapasity) {
        this.horsePower = horsePower;
        this.engineCapasity = engineCapasity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started. " +
                "\nHorsepower: "+horsePower
                +"\nEngine capacity "+engineCapasity);
    }
}
