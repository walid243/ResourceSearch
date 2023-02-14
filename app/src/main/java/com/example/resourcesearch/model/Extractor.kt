package com.example.resourcesearch.model

import android.view.View
import com.example.resourcesearch.interfaces.ExtractorInterface

class Extractor(
    private val name: String,
    private val view: View,
    private val material: String
    ): ExtractorInterface {
    private var level: Int = 1
    private var extracting: Boolean = false
    private val oreResistance: Int = when(material) {
        "copper" -> 1
        "iron" -> 2
        "gold" -> 3
        else -> 0
    }
    override fun setLevel() {
        TODO("Not yet implemented")
    }

    override fun getLevel(): Int {
        TODO("Not yet implemented")
    }

    override fun setExtracting() {
        TODO("Not yet implemented")
    }

    override fun getExtracting(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getView(): View {
        TODO("Not yet implemented")
    }

    override fun getMaterial(): String {
        TODO("Not yet implemented")
    }

    override fun getOreResistance(): Int {
        TODO("Not yet implemented")
    }
}