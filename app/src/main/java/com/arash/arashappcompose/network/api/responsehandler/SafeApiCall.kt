package com.arash.arashapp.network.responsehandler

import android.util.Log
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

/**
 * This method will be executed on the context of the CoroutineDispatcher.
 */
suspend fun <T> safeApiCall(
    dispatcher: CoroutineDispatcher,
    apiCall: suspend () -> T
): NetworkResultWrapper<T> {

    return withContext(dispatcher) {
        try {
            NetworkResultWrapper.Success(apiCall.invoke())
        } catch (throwable: Throwable) {
            Log.d("throwable" ,throwable?.message?:" some error")
            NetworkResultWrapper.NetworkError
        }
    }
}