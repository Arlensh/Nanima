package com.optic.nanima.providers;

import com.optic.nanima.models.FCMBody;
import com.optic.nanima.models.FCMResponse;
import com.optic.nanima.retrofit.IFCMApi;
import com.optic.nanima.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {

    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClient(url).create(IFCMApi.class).send(body);
    }

}
