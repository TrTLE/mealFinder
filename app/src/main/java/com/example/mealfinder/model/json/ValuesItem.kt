package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class ValuesItem(@SerializedName("label")
                      val label: String = "",
                      @SerializedName("value")
                      val value: String = "")