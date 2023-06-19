package com.example.set_customlistview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.set_customlistview_kotlin.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding:ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}