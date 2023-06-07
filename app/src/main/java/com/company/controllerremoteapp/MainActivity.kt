package com.company.controllerremoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.controllerremoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* binding.textView.text = "lulululu"
        binding.textView.setTextColor(resources.getColor(R.color.pink))*/

    }


}