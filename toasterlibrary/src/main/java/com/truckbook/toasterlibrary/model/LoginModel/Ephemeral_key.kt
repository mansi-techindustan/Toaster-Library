package com.techindustan.truckbook.model.LoginModel
data class Ephemeral_key (

	val associated_objects : List<Associated_objects>,
	val created : Int,
	val expires : Int,
	val id : String,
	val livemode : Boolean,
	//val object : String,
	val secret : String
)