package com.example.resourcesearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.channels.Channel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val channel = Channel<Int>()
    }
}
