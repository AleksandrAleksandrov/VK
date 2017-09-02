package com.aleksandr.aleksandrov.vk.vk.rest.model.response;

import com.aleksandr.aleksandrov.vk.vk.model.Group;
import com.aleksandr.aleksandrov.vk.vk.model.Owner;
import com.aleksandr.aleksandrov.vk.vk.model.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandr on 8/29/17.
 */

public class ItemWithSendersResponse<T> extends BaseItemResponse<T> {
    private List<Profile> profiles = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();

    private List<Profile> getProfiles() {
        return profiles;
    }

    private List<Group> getGroups() {
        return groups;
    }

    private List<Owner> getAllSenders() {
        List<Owner> all = new ArrayList<>();
        all.addAll(getProfiles());
        all.addAll(getGroups());
        return all;
    }

    public Owner getSender(int id) {
        for (Owner owner : getAllSenders()) {
            if (owner.getId() == Math.abs(id)) {
                return owner;
            }
        }

        return null;
    }
}
