package com.aleksandr.aleksandrov.vk.vk.mvp.presenter;

import com.aleksandr.aleksandrov.vk.vk.CurrentUser;
import com.aleksandr.aleksandrov.vk.vk.mvp.view.MainView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by aleksandr on 8/17/17.
 */
@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void checkAuth() {
        if (!CurrentUser.isAuthorized())
            getViewState().startSignId();
        else
            getViewState().signedId();
    }
}
