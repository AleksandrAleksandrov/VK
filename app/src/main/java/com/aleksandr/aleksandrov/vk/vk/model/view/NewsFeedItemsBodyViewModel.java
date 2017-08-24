package com.aleksandr.aleksandrov.vk.vk.model.view;

import android.view.View;

import com.aleksandr.aleksandrov.vk.vk.model.WallItem;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.BaseViewHolder;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.NewsItemBodyHolder;

/**
 * Created by aleksandr on 8/24/17.
 */

public class NewsFeedItemsBodyViewModel extends BaseViewModel {

    private int mId;

    private String mText;

    public NewsFeedItemsBodyViewModel(WallItem wallItem) {
        this.mId = wallItem.getId();
        this.mText = wallItem.getText();
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.NewsFeedItemBody;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new NewsItemBodyHolder(view);
    }

    public int getId() {
        return mId;
    }

    public String getText() {
        return mText;
    }
}
