package com.sample.sampleapp.dagger;

import com.sample.sampleapp.network.ApiInterface;
import com.sample.sampleapp.util.ServiceGenerator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sahan Thinusha on 2/3/2018.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    ApiInterface provideApiInterface(){
        return ServiceGenerator.getClient().create(ApiInterface.class);
    }

}