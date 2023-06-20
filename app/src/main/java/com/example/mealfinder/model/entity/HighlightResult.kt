package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class HighlightResult(@SerializedName("dishType")
                           val dishType: DishType,
                           @SerializedName("ingredients")
                           val ingredients: List<IngredientsItem>?,
                           @SerializedName("title")
                           val title: Title)