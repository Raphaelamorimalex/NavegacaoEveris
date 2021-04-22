package com.example.navegacaoeveris

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
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
    private fun showToast(mensagem: String){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inFlater: MenuInflater =  menuInflater
        inFlater.inflate(R.menu.menu, menu)
        return true
    }

    private fun initialedrawler(){

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            (R.id.item_menu_1)->{
                showToast("Exibindo item menu 1")
                true
            }(R.id.item_menu_2)->{
                showToast("Exibindo item menu 2")
                true
            }else -> onOptionsItemSelected(item)
        }
    }
}