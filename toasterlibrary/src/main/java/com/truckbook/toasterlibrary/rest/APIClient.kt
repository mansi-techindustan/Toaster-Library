package com.techindustan.truckbook.rest
import com.truckbook.toasterlibrary.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import java.util.concurrent.TimeUnit

/**
 * Created by android on 16/8/18.
 */
class APIClient {
    companion object {
        private var loggingInterceptor: HttpLoggingInterceptor? = null
        //dev
        //val baseURLDEV: String = "http://truckbook.ths.agency/"
        //val baseURLLIVE: String = "http://api.truckbook.io/"
        //live
        val baseURL: String = "http://truckbook.ths.agency/"

        var retofit: Retrofit? = null
        private var clientBuilder: OkHttpClient.Builder? = null
        val client: Retrofit
            get() {
                if (retofit == null) {
                    val client = OkHttpClient.Builder().connectTimeout(10000, TimeUnit.SECONDS).readTimeout(10000, TimeUnit.SECONDS)
                    loggingInterceptor = HttpLoggingInterceptor()
                    loggingInterceptor!!.setLevel(HttpLoggingInterceptor.Level.BODY)
                    client.addInterceptor(loggingInterceptor!!);
                    retofit = Retrofit.Builder()
                            .baseUrl(baseURL)
                            .client(client.build())
                            //.addConverterFactory(ScalarsConverterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                }
                return retofit!!
            }




    }





}