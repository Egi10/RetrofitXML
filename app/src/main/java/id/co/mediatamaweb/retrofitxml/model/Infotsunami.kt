package id.co.mediatamaweb.retrofitxml.model

import com.google.gson.annotations.SerializedName

data class Infotsunami (
    @SerializedName("Gempa")
    val gempa: Gempa? = null
)