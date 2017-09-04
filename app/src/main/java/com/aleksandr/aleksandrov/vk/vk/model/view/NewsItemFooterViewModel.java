package com.aleksandr.aleksandrov.vk.vk.model.view;

import android.view.View;

import com.aleksandr.aleksandrov.vk.vk.model.WallItem;
import com.aleksandr.aleksandrov.vk.vk.model.view.counter.CommentCounterViewModel;
import com.aleksandr.aleksandrov.vk.vk.model.view.counter.LikeCounterViewModel;
import com.aleksandr.aleksandrov.vk.vk.model.view.counter.RepostCounterViewModel;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.BaseViewHolder;
import com.aleksandr.aleksandrov.vk.vk.ui.holder.NewsItemFooterHolder;

/**
 * Created by aleksandr on 9/4/17.
 */

public class NewsItemFooterViewModel extends BaseViewModel {

    private int mId;
    private int ownerId;
    private long mDateLong;

    private LikeCounterViewModel mLikes;
    private CommentCounterViewModel mComments;
    private RepostCounterViewModel mReposts;

    public NewsItemFooterViewModel(WallItem wallItem) {
        this.mId = wallItem.getId();
        this.ownerId = wallItem.getOwnerId();
        this.mDateLong = wallItem.getDate();
        this.mLikes = new LikeCounterViewModel(wallItem.getLikes());
        this.mComments = new CommentCounterViewModel(wallItem.getComments());
        this.mReposts = new RepostCounterViewModel(wallItem.getReposts());
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.NewsFeedItemFooter;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new NewsItemFooterHolder(view);
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public long getDateLong() {
        return mDateLong;
    }

    public void setDateLong(long dateLong) {
        mDateLong = dateLong;
    }

    public LikeCounterViewModel getLikes() {
        return mLikes;
    }

    public void setLikes(LikeCounterViewModel likes) {
        mLikes = likes;
    }

    public CommentCounterViewModel getComments() {
        return mComments;
    }

    public void setComments(CommentCounterViewModel comments) {
        mComments = comments;
    }

    public RepostCounterViewModel getReposts() {
        return mReposts;
    }

    public void setReposts(RepostCounterViewModel reposts) {
        mReposts = reposts;
    }
}
