package com.aleksandr.aleksandrov.vk.vk.rest.api;

import com.aleksandr.aleksandrov.vk.vk.rest.model.response.BaseItemResponse;
import com.aleksandr.aleksandrov.vk.vk.rest.model.response.Full;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aleksandr on 8/19/17.
 */

public interface WallApi {

    @GET(ApiMethods.WALL_GET)
    Call<Full<BaseItemResponse>> get(
            @Query("owner_id") String ownerId,
            @Query("access_token") String accessToken,
            @Query("extended") Integer extended,
            @Query("v") String version);
}
