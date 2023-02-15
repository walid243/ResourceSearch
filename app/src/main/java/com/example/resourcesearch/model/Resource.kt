package com.example.resourcesearch.model

import android.view.View
import com.example.resourcesearch.interfaces.ResourceInterface
import kotlinx.coroutines.delay

class Resource(val view: View, val initialPosition: Float = 1080F, val goal: Float = 1030F) : ResourceInterface {
    private val material = "copper"
    private var isMoving: Boolean = false
    override suspend fun move() {
        println(
            "-------------------- In Resource.move() --------------------"
        )
        println("initialPosition: $initialPosition")
        println("goal: $goal")
        println("view.y: ${view.y}")
        view.visibility = View.VISIBLE
        view.y = initialPosition
        while (view.y > goal) {
            if (!isMoving) isMoving = true
            println("view.y: ${view.y} --- goal: $goal")
            println("-------------------- In Resource.move() while --------------------")
            view.y -= 1
            delay(1)
        }
        isMoving = false
        view.visibility = View.INVISIBLE
    }

    fun isAtStash(): Boolean {
        return view.y == goal
    }

    override fun isMoving(): Boolean {
        return isMoving
    }
}