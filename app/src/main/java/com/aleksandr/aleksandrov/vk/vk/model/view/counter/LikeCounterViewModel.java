package com.aleksandr.aleksandrov.vk.vk.model.view.counter;

import com.aleksandr.aleksandrov.vk.vk.model.Likes;

/**
 * Created by aleksandr on 9/4/17.
 */

public class LikeCounterViewModel extends CounterViewModel {

    private Likes mLikes;

    public LikeCounterViewModel(Likes likes) {
        super(likes.getCount());

        this.mLikes = likes;

        if (mLikes.getUserLikes() == 1)
            setAccentColor();
    }

    public Likes getLikes() {
        return mLikes;
    }
}
