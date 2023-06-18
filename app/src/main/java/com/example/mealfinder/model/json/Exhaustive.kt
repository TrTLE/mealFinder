package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class Exhaustive(@SerializedName("typo")
                      val typo: Boolean = false,
                      @SerializedName("nbHits")
                      val nbHits: Boolean = false)