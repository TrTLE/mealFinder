package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class SearchFiltersItem(@SerializedName("values")
                             val values: List<ValuesItem>?,
                             @SerializedName("label")
                             val label: String = "",
                             @SerializedName("value")
                             val value: String = "")