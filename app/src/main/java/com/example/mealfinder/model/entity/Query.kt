package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class Query(@SerializedName("aqt")
                 val aqt: String = "")