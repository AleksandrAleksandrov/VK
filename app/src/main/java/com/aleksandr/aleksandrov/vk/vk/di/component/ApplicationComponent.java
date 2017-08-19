package com.aleksandr.aleksandrov.vk.vk.di.component;

import com.aleksandr.aleksandrov.vk.vk.di.module.ApplicationModule;
import com.aleksandr.aleksandrov.vk.vk.di.module.ManagerModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aleksandr on 8/19/17.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ManagerModule.class})
public interface ApplicationComponent {

}
