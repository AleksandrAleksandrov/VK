package com.aleksandr.aleksandrov.vk.vk.di.module;

import com.aleksandr.aleksandrov.vk.vk.rest.RestClient;
import com.aleksandr.aleksandrov.vk.vk.rest.api.WallApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aleksandr on 8/19/17.
 */
@Module
public class RestModule {
    private RestClient mRestClient;

    public RestModule() {
        mRestClient = new RestClient();
    }

    @Singleton
    @Provides
    public RestClient provideRestClient() {
        return mRestClient;
    }

    @Singleton
    @Provides
    public WallApi provideWallApi() {
        return mRestClient.createService(WallApi.class);
    }
}
