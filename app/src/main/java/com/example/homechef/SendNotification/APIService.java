package com.example.homechef.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAP92jp4w:APA91bE-_4ES31UTWsqAd9j3haQGd-fuL4s6TTWq9R5xpqoFdkmKGTUBdlWYtmabcJk-agY_X7C8-AOFR87HhLWUp0TfILrEsXBadzzvIPwnt_1BOOsYn9vznI9_jrtZC7i3LTPOKotT"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
