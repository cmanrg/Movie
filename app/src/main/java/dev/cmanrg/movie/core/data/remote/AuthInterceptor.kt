package dev.cmanrg.movie.core.data.remote

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request = originalRequest.newBuilder()
            .header("Authorization", "Bearer $API_TOKEN")
            .header("accept", "application/json")
            .build()
        return chain.proceed(request)
    }

    companion object {
        // TODO: Move this to BuildConfig or local.properties for security
        const val API_TOKEN = "YOUR_API_TOKEN"
    }
}
