package com.example.navigationlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.navigationlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            b = ActivityMainBinding.inflate(layoutInflater)
            setContentView(b.root)

            b.btnNavMenu.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.opNext -> {
                        Navigation.findNavController(b.fragmentContainerView)
                            .navigate(R.id.secondFragment)
                        true
                    }
                    R.id.opBack -> {
                        Navigation.findNavController(b.fragmentContainerView)
                            .navigate(R.id.initFragment)
                        true
                    }

                    else -> false
                }
            }
        }
    }

