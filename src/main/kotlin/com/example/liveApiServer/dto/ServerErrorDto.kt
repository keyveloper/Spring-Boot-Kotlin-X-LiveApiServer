package com.example.liveApiServer.dto

// use only when error occur
data class ServerErrorDto(
    val type: String,
    val title: String,
    val status: Int,
    val detail: String,
    val instance: String
)