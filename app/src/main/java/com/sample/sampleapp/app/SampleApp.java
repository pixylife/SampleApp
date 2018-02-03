package com.sample.sampleapp.app;

import android.app.Application;

import com.sample.sampleapp.dagger.AppComponent;
import com.sample.sampleapp.dagger.AppModule;
import com.sample.sampleapp.dagger.DaggerAppComponent;

/**
 * Created by Sahan Thinusha on 2/3/2018.
 */

public class SampleApp extends Application {
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    protected AppComponent initDagger(SampleApp application){
        return DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = initDagger(this);
    }
}
