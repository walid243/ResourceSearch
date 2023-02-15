package com.example.resourcesearch.model

import android.view.View
import com.example.resourcesearch.interfaces.ExtractorInterface
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.channelFlow

class Extractor (
    private val name: String,
    private val view: View,
    private val material: String
    ): ExtractorInterface {
    private var level: Int = 1
    private val maxLevel = 3
    private var extracting: Boolean = false
    private var oreResistance: Int = when(material) {
        "copper" -> maxLevel / level
        "iron" -> maxLevel / level * 2
        "gold" -> maxLevel / level * 3
        else -> 0
    }
    private var speed = oreResistance * level
    override fun setLevel() {
        if (level < maxLevel) {
            level++
        }
    }

    override fun getLevel(): Int {
        return level
    }

    override fun toggleExtracting() {
        extracting = !extracting
    }

    override fun isExtracting(): Boolean {
        return extracting
    }

    override fun getName(): String {
        return name
    }

    override fun getView(): View {
        return view
    }

    override fun getMaterial(): String {
        return material
    }

    override fun getOreResistance(): Int {
        return oreResistance
    }

    override fun setOreResistance(material: String){
        oreResistance = when(material) {
            "copper" -> maxLevel / level
            "iron" -> maxLevel / level * 2
            "gold" -> maxLevel / level * 3
            else -> 0
        }
    }

    override suspend fun extract() {
        channelFlow {
            while (true) {
                println("-------------------- In Extractor.extract() --------------------")
                if (extracting) {
                    send(1)
                }
        }

        }

    }

}