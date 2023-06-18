package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class ProcessingTimingsMS(@SerializedName("request")
                               val request: Request,
                               @SerializedName("total")
                               val total: Int = 0,
                               @SerializedName("fetch")
                               val fetch: Fetch)