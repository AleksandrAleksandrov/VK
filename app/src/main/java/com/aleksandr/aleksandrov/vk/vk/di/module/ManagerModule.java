package com.aleksandr.aleksandrov.vk.vk.di.module;

import com.aleksandr.aleksandrov.vk.vk.common.manager.MyFragmentManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aleksandr on 8/19/17.
 */

@Module
public class ManagerModule {

    @Singleton
    @Provides
    MyFragmentManager provideFragmentManager() {
        return new MyFragmentManager();
    }
}
