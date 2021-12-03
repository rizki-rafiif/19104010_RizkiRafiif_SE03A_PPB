package com.rizkirafiif_19104010.listviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.rizkirafiif_19104010.listviews.MainAdapter.MainViewHolder
import com.rizkirafiif_19104010.listviews.databinding.ItemListBinding

class MainAdapter(private val listData: ArrayList<MyData>) : RecyclerView.Adapter<MainViewHolder>() {

    class MainViewHolder (view : View) : RecyclerView.ViewHolder(view)
    private lateinit var binding: ItemListBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        binding = ItemListBinding.bind(view)
        return MainViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = listData[position]

        binding.apply {
            ivPariwisata.load(data.photo){
                transformations(CircleCropTransformation())
            }
            tvNamaPariwisata.text = data.name
            tvDeskripsiPariwisata.text = data.description
        }
    }

    override fun getItemCount(): Int = listData.size
}