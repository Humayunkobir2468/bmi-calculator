package com.example.bmicalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.showBtn.setOnClickListener{

            val hight=binding.hightET.text.toString().toDouble()
            val weight=binding.weightEt.text.toString().toDouble()
            val bmi=weight/(hight*hight)
            binding.BmiTv.text =String.format("BMI is % 2f",bmi)

        }

    }
}