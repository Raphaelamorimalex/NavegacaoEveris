package com.example.navegacaoeveris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById(R.id.rv_list)
    }
    private val adapter = ContactAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private fun bindViews(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        upDateList()
    }

    private fun upDateList(){
        adapter.upDateList(
            arrayListOf(
                Contact(
                    name = "Raphael Amorim",
                    telephone = "(32)98477-7965",
                    photo = "img.png"
                )
            )
        )
    }
}