package com.rizkirafiif_19104010.pertemuan8scrollview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rizkirafiif_19104010.pertemuan8scrollview.DetailActivity
import com.rizkirafiif_19104010.pertemuan8scrollview.MyData
import com.rizkirafiif_19104010.pertemuan8scrollview.R


class CardViewDataAdapter(private val listMyDatas: ArrayList<MyData>, val context: Context) :
    RecyclerView.Adapter<CardViewDataAdapter.CardViewViewHolder>() {
    private lateinit var extraData:String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview, parent, false)

        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val myData = listMyDatas[position]
        Glide.with(holder.itemView.context)
            .load(myData.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = myData.name
        holder.tvDetail.text = myData.description
        holder.btnFavorite.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Favorite " + listMyDatas[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }
        holder.btnShare.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Share " + listMyDatas[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }

        holder.itemView.setOnClickListener {
            val moveWithObjectIntent = Intent(context, DetailActivity::class.java)
            moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MYDATA, myData)
//            moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MYNAME, myData.name)
//            moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MYDESCRIPTION, myData.description)
//            moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MYPHOTO, myData.photo)
            context.startActivity(moveWithObjectIntent)
        }
    }
    companion object {
        const val EXTRA_MYDATA = "extra_mydata"
//        const val EXTRA_MYNAME = "extra_name"
//        const val EXTRA_MYDESCRIPTION = "extra_description"
//        const val EXTRA_MYPHOTO = "extra_photo"
    }
    override fun getItemCount(): Int {
        return listMyDatas.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}