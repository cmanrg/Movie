package dev.cmanrg.movie.core.data.remote

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(
    private val apiKey: String
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val requestWithAuth = originalRequest.newBuilder()
            .addHeader("Authorization", "Bearer $apiKey")
            .addHeader("accept", "application/json")
            .build()

        return chain.proceed(requestWithAuth)
    }
}
