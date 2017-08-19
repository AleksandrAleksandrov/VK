package com.aleksandr.aleksandrov.vk.vk;

import android.app.Application;

import com.aleksandr.aleksandrov.vk.vk.di.component.ApplicationComponent;
import com.aleksandr.aleksandrov.vk.vk.di.component.DaggerApplicationComponent;
import com.aleksandr.aleksandrov.vk.vk.di.module.ApplicationModule;
import com.vk.sdk.VKSdk;

/**
 * Created by aleksandr on 8/17/17.
 */

public class MyApplication extends Application {

    private static ApplicationComponent sApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initComponent();

        VKSdk.initialize(this);
    }

    private void initComponent() {
        sApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return sApplicationComponent;
    }
}
