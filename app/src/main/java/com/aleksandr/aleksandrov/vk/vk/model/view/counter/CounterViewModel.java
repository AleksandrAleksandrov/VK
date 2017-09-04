package com.aleksandr.aleksandrov.vk.vk.model.view.counter;

import com.aleksandr.aleksandrov.vk.vk.R;

/**
 * Created by aleksandr on 9/3/17.
 */

public class CounterViewModel {

    protected int mCount;
    protected int mIconColor = R.color.colorIconDis;
    protected int mTextColor = R.color.colorIconDis;

    public CounterViewModel(int count) {
        this.mCount = count;
        if (mCount > 0)
            setDefaultColor();
        else
            setDisableColor();
    }

    private void setDisableColor() {
        mIconColor = R.color.colorIconDis;
        mTextColor = R.color.colorIconDis;
    }

    private void setDefaultColor() {
        mIconColor = R.color.colorIcon;
        mTextColor = R.color.colorIcon;
    }

    protected void setAccentColor() {
        mIconColor = R.color.colorAccent;
        mTextColor = R.color.colorAccent;
    }

    public int getCount() {
        return mCount;
    }

    public int getIconColor() {
        return mIconColor;
    }

    public int getTextColor() {
        return mTextColor;
    }
}
