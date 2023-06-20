package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class PageProps(@SerializedName("isInitiallyMobile")
                     val isInitiallyMobile: Boolean = false,
                     @SerializedName("selectedFilters")
                     val selectedFilters: SelectedFilters,
                     @SerializedName("seoData")
                     val seoData: SeoData,
                     @SerializedName("searchOrders")
                     val searchOrders: List<SearchOrdersItem>?,
                     @SerializedName("searchFilters")
                     val searchFilters: List<SearchFiltersItem>?,
                     @SerializedName("domUser")
                     val domUser: String? = null,
                     @SerializedName("currentPage")
                     val currentPage: Int = 0,
                     @SerializedName("searchResults")
                     val searchResults: SearchResults)