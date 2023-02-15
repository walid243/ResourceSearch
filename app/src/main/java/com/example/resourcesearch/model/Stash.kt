package com.example.resourcesearch.model

import android.view.View
import com.example.resourcesearch.interfaces.StashInterface

class Stash(val view: View): StashInterface {
    private var level: Int = 1
    private var capacity: Int = 3
    private val maxLevel = 3
    private var stash = 0
    private var isFull: Boolean = false

    override fun setLevel() {
        if (level < maxLevel) {
            level++
        }
    }

    override fun getLevel(): Int {
        return level
    }

    override fun setCapacity() {
    capacity = level * 3
    }

    override fun getCapacity(): Int {
        return capacity
    }

    override suspend fun addResource() {
        if (!isFull) stash+=1
    }

    override fun removeResource() {
        stash--
    }

    override fun getResource(): Int {
        return stash
    }

    override fun isStashing(): Boolean {
        return !isFull
    }

    override fun setStatus() {
        isFull = !isFull
    }


}