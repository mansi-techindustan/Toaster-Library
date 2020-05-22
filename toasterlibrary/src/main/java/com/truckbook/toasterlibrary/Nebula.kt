package com.truckbook.toasterlibrary

import android.content.ContentValues
import android.content.Context
import android.util.Log

class Nebula private constructor(private val context: Context){
    val TAG="Nebula"

    companion object {
        @JvmStatic
        private lateinit var instance: Nebula
        @JvmStatic
        fun init(context: Context) {
            try {
                getInstance()
                logoutRequest(context)
                throw RuntimeException("Nebula already initialized")
            } catch (e: IllegalAccessException) {
                instance = Nebula(context)
                Log.d(ContentValues.TAG, "Initialized successfully")
            }
        }

        @JvmStatic
        fun getInstance(): Nebula {
            try {
                return instance
            } catch (e: UninitializedPropertyAccessException) {
                throw IllegalAccessException(
                    "You must call Nebula.init() in your application class"
                )
            }
        }
    }

    private fun getApplicationContext(): Context {
        if (context.applicationContext == null) {
            return context
        } else {
            return context.applicationContext
        }
    }

}