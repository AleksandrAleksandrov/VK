package com.aleksandr.aleksandrov.vk.vk;

import android.app.Application;

import com.vk.sdk.VKSdk;

/**
 * Created by aleksandr on 8/17/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        VKSdk.initialize(this);
    }
}
