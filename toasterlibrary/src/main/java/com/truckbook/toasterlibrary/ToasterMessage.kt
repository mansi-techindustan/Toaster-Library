package com.truckbook.toasterlibrary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.JsonObject
import com.techindustan.truckbook.model.LoginModel.LoginResponse
import com.techindustan.truckbook.model.logout.LogoutResponse
import com.techindustan.truckbook.rest.APIClient
import com.techindustan.truckbook.rest.ApiService
import retrofit2.Call
import retrofit2.Callback

class ToasterMessage  {

    fun s(context: Context) {

       // Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        // login();
       // logoutRequest(context)
    }


    fun logoutRequest(context: Context) {
        var apiServices = APIClient.client.create(ApiService::class.java)
        val token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODk5Njc0NTQsIm5iZiI6MTU4OTk2NzQ1NCwianRpIjoiN2JlNDc3NzAtMmY3Ni00MWIzLWExODgtOWU4MjczZTI4OWQyIiwiaWRlbnRpdHkiOnsiaWQiOiIxYTJhZTRiNS0zODE5LTRlMTctYTk1Mi0wMDEwMmU1Y2QyMzQiLCJuYW1lIjoiT1dORVIgT1BFUkFUT1IiLCJwaG9uZSI6Iis5MTg4OTQyNTkwOTkiLCJlbWFpbCI6bnVsbCwiaW1hZ2UiOiIvYXNzZXRzL3Byb2ZpbGUtaW1hZ2VzL2U0MzA3ODRhLTczMzAtNGFmOS1iMDliLWI2YzU0NmY1Y2QwZi5qcGVnIiwidXNlcl90eXBlIjozfSwiZnJlc2giOmZhbHNlLCJ0eXBlIjoiYWNjZXNzIn0.Ik8yHB1WB_xCr0w85bCS1qx5mzTCi2ticK1NTM_hmkY"
        val authtoken = "Bearer" + " " + token


        val call = apiServices.logout(authtoken)

        call.enqueue(object : Callback<LogoutResponse> {
            override fun onResponse(call: Call<LogoutResponse>, response: retrofit2.Response<LogoutResponse>) {
                val message = response.body()!!.message

                Toast.makeText(context,response.body()!!.message,Toast.LENGTH_LONG).show()
                //finish()

            }
            override fun onFailure(call: Call<LogoutResponse>?, t: Throwable?) {
              //  Utilities.showToastTop(this@SettingsActivity, "User logged Out Successfully")
                Toast.makeText(context,"User logged Out Successfully",Toast.LENGTH_LONG).show()
                // Utilities.showSnackBar(ErrorUtil.handleFailureMessage(t),container)
            }
        })
    }


}