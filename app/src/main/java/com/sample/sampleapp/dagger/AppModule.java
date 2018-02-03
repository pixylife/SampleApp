package com.sample.sampleapp.dagger;

import android.app.Application;

import dagger.Module;

/**
 * Created by Sahan Thinusha on 2/3/2018.
 */

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }
}
