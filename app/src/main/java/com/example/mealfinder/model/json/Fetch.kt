package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class Fetch(@SerializedName("total")
                 val total: Int = 0)