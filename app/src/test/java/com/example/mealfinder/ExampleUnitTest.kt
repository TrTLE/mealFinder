package com.example.mealfinder

import com.example.mealfinder.model.entity.RecipeClass
import com.google.gson.Gson
import org.jsoup.Jsoup
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun urlParser_OK() {
        // ARRANGE
        val baseUrl = "http://www.marmiton.org/recettes/recherche.aspx?"
        val query = "aqt=boeuf+bourguignon&sort=markdesc"
        val url = baseUrl + query

        // ACT
        val doc = Jsoup.connect(url)
            .userAgent("Mozilla")
            .timeout(5000)
            .get()

        val document = Jsoup.parse(doc.html())
        val articles = document.getElementById("__NEXT_DATA__")
        val jsonStr = articles!!.data()

        val gson = Gson()
        val recipeEntity = gson.fromJson(jsonStr, RecipeClass::class.java)

        val firstRecipe = recipeEntity.props.pageProps.searchResults.hits!![0]
        println(firstRecipe.title)
        println(firstRecipe.url)
        println(firstRecipe.averageRating)
        println(firstRecipe.nbRating)
        println(firstRecipe.difficulty)
        println(firstRecipe.preparationTime)
        println(firstRecipe.contentType)
        println(firstRecipe.duration)
        println(firstRecipe.cost)
        println(firstRecipe.ingredients)
        println(firstRecipe.image.pictureUrls.origin)

        // ASSERT
        val toto = 123
        println(toto)
    }
}