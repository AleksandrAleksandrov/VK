package com.aleksandr.aleksandrov.vk.vk.rest.model.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandr on 8/19/17.
 */

public class BaseItemResponse<T> {
    public Integer count;
    public List<T> items = new ArrayList<>();

    public Integer getCount() {
        return count;
    }

    public List<T> getItems() {
        return items;
    }
}
