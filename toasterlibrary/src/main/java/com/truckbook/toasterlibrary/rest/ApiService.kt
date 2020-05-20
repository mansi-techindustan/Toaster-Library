package com.techindustan.truckbook.rest

import android.content.Context
import com.google.gson.JsonObject
import com.techindustan.truckbook.model.LoginModel.LoginResponse
import com.techindustan.truckbook.model.logout.LogoutResponse
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST
import org.json.JSONObject
import retrofit2.http.HTTP
import retrofit2.http.FormUrlEncoded

/**
 * Created by android on 16/8/18.
 */
public  interface ApiService {
    val context: Context


    @Headers(
        "Content-type: application/json"
    )
    @POST("login")
    fun login(@Body jsonObject: JsonObject): retrofit2.Call<LoginResponse>


    @GET("logout")
    fun logout(@Header("Authorization") authtoken: String): Call<LogoutResponse>
}
