package com.aleksandr.aleksandrov.vk.vk.model.view.counter;

import com.aleksandr.aleksandrov.vk.vk.model.Reposts;

/**
 * Created by aleksandr on 9/4/17.
 */

public class RepostCounterViewModel extends CounterViewModel {

    private Reposts mReposts;

    public RepostCounterViewModel(Reposts reposts) {
        super(reposts.getCount());

        this.mReposts = reposts;
        if (mReposts.getUserReposted() == 1)
            setAccentColor();

    }

    public Reposts getReposts() {
        return mReposts;
    }
}
