package com.example.resourcesearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.resourcesearch.databinding.ActivityMainBinding
import com.example.resourcesearch.databinding.ActivityMainBinding.inflate
import com.example.resourcesearch.model.Cycler
import com.example.resourcesearch.model.Extractor
import com.example.resourcesearch.model.Resource
import com.example.resourcesearch.model.Stash
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
        val cycle1 = Cycler(
            Extractor("extractor1", binding.extractor1, "copper"),
            Stash(binding.resource1),
            Resource(binding.ore1)
        )
//        val cycle2 = Cycler(
//            Extractor("extractor2", binding.extractor2, "iron"),
//            Stash(binding.ore2),
//            Resource(binding.resource2, binding.extractor2.y, binding.ore2.y)
//        )
//        val cycle3 = Cycler(
//            Extractor("extractor3", binding.extractor3, "gold"),
//            Stash(binding.ore3),
//            Resource(binding.resource3, binding.extractor3.y, binding.ore3.y)
//        )
        CoroutineScope(Dispatchers.Default).launch {
            cycle1.start()
//            cycle2.start()
//            cycle3.start()
        }
    }

}
