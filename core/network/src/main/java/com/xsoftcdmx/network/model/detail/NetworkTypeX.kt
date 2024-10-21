package com.xsoftcdmx.network.model.detail


import com.google.gson.annotations.SerializedName

data class NetworkTypeX(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)