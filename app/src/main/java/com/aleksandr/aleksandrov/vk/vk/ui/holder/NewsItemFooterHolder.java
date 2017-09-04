package com.aleksandr.aleksandrov.vk.vk.ui.holder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import com.aleksandr.aleksandrov.vk.vk.MyApplication;
import com.aleksandr.aleksandrov.vk.vk.R;
import com.aleksandr.aleksandrov.vk.vk.common.utils.Utils;
import com.aleksandr.aleksandrov.vk.vk.model.view.NewsItemFooterViewModel;
import com.aleksandr.aleksandrov.vk.vk.model.view.counter.CommentCounterViewModel;
import com.aleksandr.aleksandrov.vk.vk.model.view.counter.LikeCounterViewModel;
import com.aleksandr.aleksandrov.vk.vk.model.view.counter.RepostCounterViewModel;

import javax.inject.Inject;

/**
 * Created by aleksandr on 9/4/17.
 */

public class NewsItemFooterHolder extends BaseViewHolder<NewsItemFooterViewModel> {

    private TextView tvDate;

    private TextView tvLikesCount;
    private TextView tvLikesIcon;
    private TextView tvCommentsIcon;
    private TextView tvCommentsCount;
    private TextView tvRepostIcon;
    private TextView tvRepostCount;

    @Inject
    Typeface mGoogleFontTypeface;

    private Resources mResources;
    private Context mContext;

    public NewsItemFooterHolder(View itemView) {
        super(itemView);

        MyApplication.getApplicationComponent().inject(this);

        mContext = itemView.getContext();
        mResources = mContext.getResources();

        tvDate = itemView.findViewById(R.id.tv_date);
        tvLikesIcon = itemView.findViewById(R.id.tv_likes_icon);
        tvLikesCount = itemView.findViewById(R.id.tv_likes_count);
        tvCommentsCount = itemView.findViewById(R.id.tv_comments_count);
        tvCommentsIcon = itemView.findViewById(R.id.tv_comments_icon);
        tvRepostIcon = itemView.findViewById(R.id.tv_repost_icon);
        tvRepostCount = itemView.findViewById(R.id.tv_reposts_count);

        tvLikesIcon.setTypeface(mGoogleFontTypeface);
        tvCommentsIcon.setTypeface(mGoogleFontTypeface);
        tvRepostIcon.setTypeface(mGoogleFontTypeface);
    }

    @Override
    public void bindViewHolder(NewsItemFooterViewModel item) {
        tvDate.setText(Utils.parseDate(item.getDateLong(), mContext));

        bindLikes(item.getLikes());
        bindComments(item.getComments());
        bindReposts(item.getReposts());
    }

    private void bindLikes(LikeCounterViewModel likes) {
        tvLikesCount.setText(String.valueOf(likes.getCount()));
        tvLikesCount.setTextColor(mResources.getColor(likes.getTextColor()));
        tvLikesIcon.setTextColor(mResources.getColor(likes.getIconColor()));
    }

    private void bindComments(CommentCounterViewModel comments) {
        tvCommentsCount.setText(String.valueOf(comments.getCount()));
        tvCommentsCount.setTextColor(mResources.getColor(comments.getTextColor()));
        tvCommentsIcon.setTextColor(mResources.getColor(comments.getIconColor()));
    }

    private void bindReposts(RepostCounterViewModel reposts) {
        tvRepostCount.setText(String.valueOf(reposts.getCount()));
        tvRepostCount.setTextColor(mResources.getColor(reposts.getTextColor()));
        tvRepostIcon.setTextColor(mResources.getColor(reposts.getIconColor()));
    }

    @Override
    public void unbindViewHolder() {
        tvDate.setText(null);
        tvLikesCount.setText(null);
        tvCommentsCount.setText(null);
        tvRepostCount.setText(null);
    }
}
