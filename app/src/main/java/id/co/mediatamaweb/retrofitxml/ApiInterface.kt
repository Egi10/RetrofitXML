package id.co.mediatamaweb.retrofitxml

import id.co.mediatamaweb.retrofitxml.model.Infotsunami
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("lasttsunami.xml")
    fun listRepos(): Call<ApiResponse>
}