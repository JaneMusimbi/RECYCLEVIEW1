package com.revision.recyclerviews

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.revision.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun displayNames(){
        val namesList= listOf("Jane","Musimbi","John","Joan","Juliet")
        binding.rvNames.layoutManager=LinearLayoutManager( this)
        val namesAdapter=NameRecyclerviewAdapter(namesList)
        binding.rvNames.adapter=namesAdapter
    }
}