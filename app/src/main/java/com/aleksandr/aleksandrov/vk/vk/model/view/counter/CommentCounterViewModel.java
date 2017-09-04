package com.aleksandr.aleksandrov.vk.vk.model.view.counter;

import com.aleksandr.aleksandrov.vk.vk.model.Comments;

/**
 * Created by aleksandr on 9/4/17.
 */

public class CommentCounterViewModel extends CounterViewModel {

    private Comments mComments;

    public CommentCounterViewModel(Comments comments) {
        super(comments.getCount());

        this.mComments = comments;
    }

    public Comments getComments() {
        return mComments;
    }
}
