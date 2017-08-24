package com.aleksandr.aleksandrov.vk.vk.ui.holder;

import android.view.View;
import android.widget.TextView;

import com.aleksandr.aleksandrov.vk.vk.R;
import com.aleksandr.aleksandrov.vk.vk.model.view.NewsFeedItemsBodyViewModel;

/**
 * Created by aleksandr on 8/24/17.
 */

public class NewsItemBodyHolder extends BaseViewHolder<NewsFeedItemsBodyViewModel> {

    public TextView mText;

    public NewsItemBodyHolder(View itemView) {
        super(itemView);

        mText = (TextView) itemView.findViewById(R.id.tv_text);
    }

    @Override
    public void bindViewHolder(NewsFeedItemsBodyViewModel newsFeedItemsBodyViewModel) {
        mText.setText(newsFeedItemsBodyViewModel.getText());
    }

    @Override
    public void unbindViewHolder() {
        mText.setText(null);
    }
}
