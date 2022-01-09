package com.rizkirafiif_19104010.pertemuan8scrollview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rizkirafiif_19104010.pertemuan8scrollview.adapter.CardViewDataAdapter
import com.rizkirafiif_19104010.pertemuan8scrollview.adapter.GridMyDataAdapter
import com.rizkirafiif_19104010.pertemuan8scrollview.adapter.ListMyDataAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var rv_mydata: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_mydata = findViewById(R.id.rv_mydata)
        rv_mydata.setHasFixedSize(true)
        list.addAll(getListMyDatas())
        showRecyclerList()
    }

    fun getListMyDatas(): ArrayList<MyData> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val dataLat = resources.getStringArray(R.array.data_lat)
        val dataLang = resources.getStringArray(R.array.data_lang)
        val listMyData = ArrayList<MyData>()
        for (position in dataName.indices) {
            val myData = MyData(
                dataName[position],
                dataDescription[position],
                dataPhoto[position],
                dataLat[position].toDouble(),
                dataLang[position].toDouble()
            )
            listMyData.add(myData)
        }
        return listMyData
    }

    private fun showRecyclerList() {
        rv_mydata.layoutManager = LinearLayoutManager(this)
        val listMyDataAdapter = ListMyDataAdapter(list)
        rv_mydata.adapter = listMyDataAdapter
    }

    private val list = ArrayList<MyData>()

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                showRecyclerCardView()
            }
        }
    }

    private fun showRecyclerGrid() {
        rv_mydata.layoutManager = GridLayoutManager(this, 2)
        val gridMyDataAdapter = GridMyDataAdapter(list)
        rv_mydata.adapter = gridMyDataAdapter
    }

    private fun showRecyclerCardView() {
        rv_mydata.layoutManager = LinearLayoutManager(this)
        val cardViewMyDataAdapter = CardViewDataAdapter(list, this@MainActivity)
        rv_mydata.adapter = cardViewMyDataAdapter
    }
}