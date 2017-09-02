package com.aleksandr.aleksandrov.vk.vk.model;

import com.vk.sdk.api.model.Identifiable;

/**
 * Created by aleksandr on 8/29/17.
 */

public interface Owner extends Identifiable {

    String getFullName();
    String getPhoto();
}
