package com.techindustan.truckbook.model.LoginModel

data class LoginResponse(
		val access_token: String? = null,
		val message: String? = null,
		val info: Info? = null,
		val status: Int? = null,
		val image: String? = null,
		val classified_count: Int? = null,
		val jobs_count: Int? = null,
		val customer_id: String? = null	,
		val ephemeral_key: Ephemeral_key? = null
) {
	override fun toString(): String {
		return "LoginResponse(access_token=$access_token, message=$message, info=$info, status=$status, image=$image, classified_count=$classified_count, jobs_count=$jobs_count,customer_id=$customer_id,ephemeral_key=$ephemeral_key)"
	}
}
