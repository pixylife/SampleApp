package com.sample.sampleapp.dagger;

import com.sample.sampleapp.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sahan Thinusha on 2/3/2018.
 */

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(MainActivity target);

}