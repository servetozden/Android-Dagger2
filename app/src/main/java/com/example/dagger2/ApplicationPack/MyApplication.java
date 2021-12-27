package com.example.dagger2.ApplicationPack;

import android.app.Application;

import com.example.dagger2.Component.UserComponent;

public class MyApplication extends Application {

    public static UserComponent userComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        userComponent = DaggerUserComponent
                .builder()
                .build();
    }
}
