package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class DishType(@SerializedName("matchLevel")
                    val matchLevel: String = "",
                    @SerializedName("value")
                    val value: String = "")