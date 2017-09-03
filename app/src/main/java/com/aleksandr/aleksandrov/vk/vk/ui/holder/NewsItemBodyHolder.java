package com.aleksandr.aleksandrov.vk.vk.ui.holder;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import com.aleksandr.aleksandrov.vk.vk.MyApplication;
import com.aleksandr.aleksandrov.vk.vk.R;
import com.aleksandr.aleksandrov.vk.vk.model.view.NewsItemBodyViewModel;

import javax.inject.Inject;

/**
 * Created by aleksandr on 8/24/17.
 */

public class NewsItemBodyHolder extends BaseViewHolder<NewsItemBodyViewModel> {

    private TextView tvText;

    private TextView tvAttachments;

    @Inject
    protected Typeface mFontGoogle;

    public NewsItemBodyHolder(View itemView) {
        super(itemView);
        MyApplication.getApplicationComponent().inject(this);

        tvText = itemView.findViewById(R.id.tv_text);
        tvAttachments = itemView.findViewById(R.id.tv_attachments);

        if (tvAttachments != null) {
            tvAttachments.setTypeface(mFontGoogle);
        }
    }

    @Override
    public void bindViewHolder(NewsItemBodyViewModel item) {
        tvText.setText(item.getText());
        tvAttachments.setText(item.getAttachmentString());
    }

    @Override
    public void unbindViewHolder() {
        tvText.setText(null);
        tvAttachments.setText(null);
    }
}
