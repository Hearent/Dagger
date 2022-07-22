package com.example.dagger;

import android.app.Application;

import com.example.dagger.dagger.AppComponent;
import com.example.dagger.dagger.DaggerAppComponent;


public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return component;
    }
}
