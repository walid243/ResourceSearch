package com.example.resourcesearch.interfaces

interface ResourceInterface {
    suspend fun move()
    fun isMoving(): Boolean
}