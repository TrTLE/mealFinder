package com.example.mealfinder.model.json

import com.google.gson.annotations.SerializedName

data class SearchResults(@SerializedName("serverTimeMS")
                         val serverTimeMS: Int = 0,
                         @SerializedName("exhaustiveTypo")
                         val exhaustiveTypo: Boolean = false,
                         @SerializedName("hitsPerPage")
                         val hitsPerPage: Int = 0,
                         @SerializedName("query")
                         val query: String = "",
                         @SerializedName("nbHits")
                         val nbHits: Int = 0,
                         @SerializedName("params")
                         val params: String = "",
                         @SerializedName("processingTimingsMS")
                         val processingTimingsMS: ProcessingTimingsMS,
                         @SerializedName("nbPages")
                         val nbPages: Int = 0,
                         @SerializedName("exhaustiveNbHits")
                         val exhaustiveNbHits: Boolean = false,
                         @SerializedName("hits")
                         val hits: List<HitsItem>?,
                         @SerializedName("processingTimeMS")
                         val processingTimeMS: Int = 0,
                         @SerializedName("exhaustive")
                         val exhaustive: Exhaustive,
                         @SerializedName("page")
                         val page: Int = 0)