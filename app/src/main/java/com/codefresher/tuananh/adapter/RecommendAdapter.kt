package com.codefresher.tuananh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codefresher.tuananh.R
import com.codefresher.tuananh.model.model1
import com.codefresher.tuananh.model.model2
import com.codefresher.tuananh.model.recommend

class RecommendAdapter(private val listRecommend: ArrayList<recommend>) :
    RecyclerView.Adapter<RecommendAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img: ImageView
        var rateCount: TextView
        var nameAndAddress: TextView
        var hashTag: TextView
        var distance: TextView

        init {
            img = itemView.findViewById(R.id.imgRecommend)
            rateCount = itemView.findViewById(R.id.tvRateCount)
            nameAndAddress = itemView.findViewById(R.id.tvNameRecommend)
            hashTag = itemView.findViewById(R.id.tvHashTag)
            distance = itemView.findViewById(R.id.tvDistance)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recommend, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.img.setImageResource(listRecommend[position].img)
        holder.rateCount.text = listRecommend[position].rateCount
        holder.nameAndAddress.text = listRecommend[position].nameAndAddress
        holder.hashTag.text = listRecommend[position].hastTag
        holder.distance.text = listRecommend[position].distance
    }

    override fun getItemCount(): Int {
        return listRecommend.size
    }
}