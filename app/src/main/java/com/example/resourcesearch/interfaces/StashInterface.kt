package com.example.resourcesearch.interfaces

interface StashInterface {
    fun setLevel()
    fun getLevel(): Int
    fun setCapacity()
    fun getCapacity(): Int
    suspend fun addResource()
    fun removeResource()
    fun getResource(): Int
    fun isStashing(): Boolean
    fun setStatus()

}