package com.generation.appdecliques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.generation.appdecliques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.num.observe(this){
           binding.textNumero.text = it.toString()

       }

        binding.buttonClique.setOnClickListener {

            mainViewModel.adicionar()


        }

    }
}