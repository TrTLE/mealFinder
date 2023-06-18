package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class HitsItem(@SerializedName("preparationTime")
                    val preparationTime: Int = 0,
                    @SerializedName("isOnline")
                    val isOnline: Boolean = false,
                    @SerializedName("title")
                    val title: String = "",
                    @SerializedName("cookingTime")
                    val cookingTime: Int = 0,
                    @SerializedName("duration")
                    val duration: Int = 0,
                    @SerializedName("isMenuSuggestion")
                    val isMenuSuggestion: Boolean = false,
                    @SerializedName("isPorkFree")
                    val isPorkFree: Boolean = false,
                    @SerializedName("isSweet")
                    val isSweet: Boolean = false,
                    @SerializedName("averageRating")
                    val averageRating: Double = 0.0,
                    @SerializedName("isGlutenFree")
                    val isGlutenFree: Boolean = false,
                    @SerializedName("ingredients")
                    val ingredients: List<String>?,
                    @SerializedName("isLactoseFree")
                    val isLactoseFree: Boolean = false,
                    @SerializedName("isVegetarian")
                    val isVegetarian: Boolean = false,
                    @SerializedName("isSeasonal")
                    val isSeasonal: Boolean = false,
                    @SerializedName("contentType")
                    val contentType: String = "",
                    @SerializedName("publicationDate")
                    val publicationDate: String = "",
                    @SerializedName("hasVideo")
                    val hasVideo: Boolean = false,
                    @SerializedName("image")
                    val image: Image,
                    @SerializedName("restTime")
                    val restTime: Int = 0,
                    @SerializedName("cost")
                    val cost: Int = 0,
                    @SerializedName("imageScore")
                    val imageScore: Int = 0,
                    @SerializedName("isPartnered")
                    val isPartnered: Boolean = false,
                    @SerializedName("isVegan")
                    val isVegan: Boolean = false,
                    @SerializedName("url")
                    val url: String = "",
                    @SerializedName("nbRating")
                    val nbRating: Int = 0,
                    @SerializedName("difficulty")
                    val difficulty: Int = 0,
                    @SerializedName("_highlightResult")
                    val HighlightResult: HighlightResult,
                    @SerializedName("isSalty")
                    val isSalty: Boolean = false,
                    @SerializedName("relevanceScore")
                    val relevanceScore: Double = 0.0,
                    @SerializedName("dishType")
                    val dishType: String = "",
                    @SerializedName("indexationDate")
                    val indexationDate: String = "",
                    @SerializedName("cookingType")
                    val cookingType: String = "",
                    @SerializedName("objectID")
                    val objectID: String = "",
                    @SerializedName("isSponsored")
                    val isSponsored: Boolean = false,
                    @SerializedName("nutriScore")
                    val nutriScore: String = "")