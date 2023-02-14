package com.example.resourcesearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View.inflate
import com.example.resourcesearch.databinding.ActivityMainBinding
import com.example.resourcesearch.databinding.ActivityMainBinding.inflate
import kotlinx.coroutines.channels.Channel

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val bufferedChannel = Channel<Int>(Channel.BUFFERED)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

    }

}
