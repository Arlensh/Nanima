package com.optic.nanima.retrofit;

import com.optic.nanima.models.FCMBody;
import com.optic.nanima.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAefGvHpE:APA91bH5mjEduy0FQDn4N1bpgvfhu_c05FJvmCrrWbPsqIsNH2YYf13bIwca6zIkmnrZUos8alM7JhymuXqMYi1UWotMgMqUnzHjasM6-2xlQLJwu7F5urzeqTmS5rb2jqgNtyUZ1Mze"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);
}
