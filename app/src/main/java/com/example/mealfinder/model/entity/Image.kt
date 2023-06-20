package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class Image(@SerializedName("picturePath")
                 val picturePath: String = "",
                 @SerializedName("originHeight")
                 val originHeight: Int = 0,
                 @SerializedName("centerY")
                 val centerY: Int = 0,
                 @SerializedName("pictureUrls")
                 val pictureUrls: PictureUrls,
                 @SerializedName("centerX")
                 val centerX: Int = 0,
                 @SerializedName("author")
                 val author: String? = null,
                 @SerializedName("cropYBottom")
                 val cropYBottom: String? = null,
                 @SerializedName("originWidth")
                 val originWidth: Int = 0,
                 @SerializedName("dateString")
                 val dateString: String = "",
                 @SerializedName("creationDate")
                 val creationDate: String = "",
                 @SerializedName("cropYTop")
                 val cropYTop: String? = null,
                 @SerializedName("credits")
                 val credits: String = "",
                 @SerializedName("cropXTop")
                 val cropXTop: String? = null,
                 @SerializedName("width")
                 val width: Int = 0,
                 @SerializedName("id")
                 val id: Int = 0,
                 @SerializedName("height")
                 val height: Int = 0,
                 @SerializedName("cropXBottom")
                 val cropXBottom: String? = null)