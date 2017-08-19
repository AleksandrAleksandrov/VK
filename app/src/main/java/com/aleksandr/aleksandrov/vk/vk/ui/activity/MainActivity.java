package com.aleksandr.aleksandrov.vk.vk.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.aleksandr.aleksandrov.vk.vk.CurrentUser;
import com.aleksandr.aleksandrov.vk.vk.MyApplication;
import com.aleksandr.aleksandrov.vk.vk.R;
import com.aleksandr.aleksandrov.vk.vk.consts.ApiConstants;
import com.aleksandr.aleksandrov.vk.vk.mvp.presenter.MainPresenter;
import com.aleksandr.aleksandrov.vk.vk.mvp.view.MainView;
import com.aleksandr.aleksandrov.vk.vk.ui.fragment.NewsFeedFragment;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

public class MainActivity extends BaseActivity implements MainView {

    public static final String TAG = "MainActivity";

    @InjectPresenter
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);

        mMainPresenter.checkAuth();
    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.activity_main;
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
        setContent(new NewsFeedFragment());
    }
}
