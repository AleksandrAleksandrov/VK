package com.aleksandr.aleksandrov.vk.vk.di.component;

import com.aleksandr.aleksandrov.vk.vk.di.module.ApplicationModule;
import com.aleksandr.aleksandrov.vk.vk.di.module.ManagerModule;
import com.aleksandr.aleksandrov.vk.vk.di.module.RestModule;
import com.aleksandr.aleksandrov.vk.vk.ui.activity.BaseActivity;
import com.aleksandr.aleksandrov.vk.vk.ui.activity.MainActivity;
import com.aleksandr.aleksandrov.vk.vk.ui.fragment.NewsFeedFragment;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.NewsItemBodyHolder;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.NewsItemFooterHolder;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aleksandr on 8/19/17.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ManagerModule.class, RestModule.class})
public interface ApplicationComponent {

    // Activities
    void inject(BaseActivity activity);
    void inject(MainActivity activity);

    // Fragments
    void inject(NewsFeedFragment fragment);

    // holders
    void inject(NewsItemBodyHolder holder);
    void inject(NewsItemFooterHolder holder);
}
