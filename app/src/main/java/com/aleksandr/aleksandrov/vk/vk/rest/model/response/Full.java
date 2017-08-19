package com.aleksandr.aleksandrov.vk.vk.rest.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aleksandr on 8/19/17.
 */

public class Full<T> {
    @SerializedName("response")
    @Expose
    public T response;
}
