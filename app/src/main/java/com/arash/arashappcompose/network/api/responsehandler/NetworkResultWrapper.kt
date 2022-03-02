package com.arash.arashapp.network.responsehandler

import com.arash.arashapp.network.models.ErrorResponse


/**
 * A sealed class of Result which can be Success, NetworkError.
 */
sealed class NetworkResultWrapper<out T> {
    data class Success<out T>(val value: T) : NetworkResultWrapper<T>()
    object NetworkError : NetworkResultWrapper<Nothing>()
}

