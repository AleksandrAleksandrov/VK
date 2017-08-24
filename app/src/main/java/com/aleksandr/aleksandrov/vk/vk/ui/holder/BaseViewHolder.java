package com.aleksandr.aleksandrov.vk.vk.ui.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.aleksandr.aleksandrov.vk.vk.model.view.BaseViewModel;

/**
 * Created by aleksandr on 8/22/17.
 */

public abstract class BaseViewHolder<Item extends BaseViewModel> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindViewHolder(Item item);

    public abstract void unbindViewHolder();
}
