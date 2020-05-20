package com.techindustan.truckbook.model.LoginModel

data class Info(
        val image: String? = null,
        val user_type: String? = null,
        val phone: String? = null,
        val email: String? = null,
        val mc: Any? = null,
        var classified_count: String? = null,
        var jobs_count: String? = null,
        val origin: Any? = null,
        val driver_info : Boolean? = null,
        val name: String? = null,
        val description: Any? = null,
        val id: String? = null,
        val subscribed: String? = null,
        val notification : Boolean? = null,
        val is_email_verified: Boolean? = null
)
