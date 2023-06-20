package com.example.mealfinder.model.entity

import com.google.gson.annotations.SerializedName

data class Props(@SerializedName("pageProps")
                 val pageProps: PageProps,
                 @SerializedName("__N_SSP")
                 val NSsp: Boolean = false)