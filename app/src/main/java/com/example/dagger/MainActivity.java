package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger.car.Car;
import com.example.dagger.dagger.CarComponent;
import com.example.dagger.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}