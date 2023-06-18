package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class Title(@SerializedName("matchLevel")
                 val matchLevel: String = "",
                 @SerializedName("fullyHighlighted")
                 val fullyHighlighted: Boolean = false,
                 @SerializedName("value")
                 val value: String = "",
                 @SerializedName("matchedWords")
                 val matchedWords: List<String>?)