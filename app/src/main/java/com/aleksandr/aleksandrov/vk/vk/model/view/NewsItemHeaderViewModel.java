package com.aleksandr.aleksandrov.vk.vk.model.view;

import android.view.View;

import com.aleksandr.aleksandrov.vk.vk.model.WallItem;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.BaseViewHolder;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.NewsItemHeaderHolder;

/**
 * Created by aleksandr on 9/1/17.
 */

public class NewsItemHeaderViewModel extends BaseViewModel {

    private int mId;

    private String mProfilePhoto;
    private String mProfileName;

    private boolean mIsRepost;
    private String nRepostProfileName;

    public NewsItemHeaderViewModel(WallItem wallItem) {
        mId = wallItem.getId();

        mProfilePhoto = wallItem.getSenderPhoto();
        mProfileName = wallItem.getSenderName();

        mIsRepost = wallItem.haveSharedRepost();

        if (mIsRepost)
            this.nRepostProfileName = wallItem.getSharedRepost().senderName;
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.NewsFeedItemHeader;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new NewsItemHeaderHolder(view);
    }

    public int getId() {
        return mId;
    }

    public String getProfilePhoto() {
        return mProfilePhoto;
    }

    public String getProfileName() {
        return mProfileName;
    }

    public boolean isRepost() {
        return mIsRepost;
    }

    public String getnRepostProfileName() {
        return nRepostProfileName;
    }
}
