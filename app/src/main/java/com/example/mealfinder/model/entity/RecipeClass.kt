package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class RecipeClass(@SerializedName("assetPrefix")
                       val assetPrefix: String = "",
                       @SerializedName("query")
                       val query: Query,
                       @SerializedName("gssp")
                       val gssp: Boolean = false,
                       @SerializedName("buildId")
                       val buildId: String = "",
                       @SerializedName("page")
                       val page: String = "",
                       @SerializedName("isFallback")
                       val isFallback: Boolean = false,
                       @SerializedName("customServer")
                       val customServer: Boolean = false,
                       @SerializedName("props")
                       val props: Props)