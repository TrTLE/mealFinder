package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class Request(@SerializedName("roundTrip")
                   val roundTrip: Int = 0)