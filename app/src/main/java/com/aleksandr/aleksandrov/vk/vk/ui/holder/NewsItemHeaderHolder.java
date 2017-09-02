package com.aleksandr.aleksandrov.vk.vk.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aleksandr.aleksandrov.vk.vk.R;
import com.aleksandr.aleksandrov.vk.vk.model.view.NewsItemHeaderViewModel;
import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by aleksandr on 9/1/17.
 */

public class NewsItemHeaderHolder extends BaseViewHolder<NewsItemHeaderViewModel> {

    private CircleImageView civProfileImage;

    private TextView tvName;

    private ImageView ivRepostIcon;

    private TextView tvRepostProfileName;

    public NewsItemHeaderHolder(View itemView) {
        super(itemView);

        civProfileImage = (CircleImageView) itemView.findViewById(R.id.civ_profile_image);
        tvName = (TextView) itemView.findViewById(R.id.tv_profile_name);
        ivRepostIcon = (ImageView) itemView.findViewById(R.id.iv_reposted_icon);
        tvRepostProfileName = (TextView) itemView.findViewById(R.id.tv_responsed_profile_name);
    }

    @Override
    public void bindViewHolder(NewsItemHeaderViewModel item) {
        Context context = itemView.getContext();

        Glide.with(context)
                .load(item.getProfilePhoto())
                .into(civProfileImage);
        tvName.setText(item.getProfileName());

        ivRepostIcon.setVisibility(item.isRepost() ? VISIBLE : GONE);
        tvRepostProfileName.setText(item.isRepost() ? item.getnRepostProfileName() : null);

    }

    @Override
    public void unbindViewHolder() {
        civProfileImage.setImageBitmap(null);
        tvName.setText(null);
        tvRepostProfileName.setText(null);
    }
}
