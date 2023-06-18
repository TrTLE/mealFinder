package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class PictureUrls(@SerializedName("originNoCrop")
                       val originNoCrop: String = "",
                       @SerializedName("thumb")
                       val thumb: String = "",
                       @SerializedName("origin")
                       val origin: String = "")