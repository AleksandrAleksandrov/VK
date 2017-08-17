package com.aleksandr.aleksandrov.vk.vk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.aleksandr.aleksandrov.vk.vk.consts.ApiConstants;
import com.aleksandr.aleksandrov.vk.vk.mvp.presenter.MainPresenter;
import com.aleksandr.aleksandrov.vk.vk.mvp.view.MainView;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    public static final String TAG = "MainActivity";

    @InjectPresenter
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainPresenter.checkAuth();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                // User authorized
                mMainPresenter.checkAuth();
            }

            @Override
            public void onError(VKError error) {
                // Authorization error (for example, user denied authorization)
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void startSignId() {
        VKSdk.login(this, ApiConstants.DEFAULT_LONG_SCOPE);
    }

    @Override
    public void signedId() {
        Toast.makeText(this, "Current user id" + CurrentUser.getId(), Toast.LENGTH_LONG).show();
    }
}
