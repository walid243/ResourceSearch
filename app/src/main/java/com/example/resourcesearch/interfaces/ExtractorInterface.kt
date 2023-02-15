package com.example.resourcesearch.interfaces

import android.view.View

interface ExtractorInterface {
    fun setLevel()
    fun getLevel(): Int
    fun toggleExtracting()
    fun isExtracting(): Boolean
    fun getName(): String
    fun getView(): View
    fun getMaterial(): String
    fun setOreResistance(material: String)
    fun getOreResistance(): Int
    suspend fun extract()
}