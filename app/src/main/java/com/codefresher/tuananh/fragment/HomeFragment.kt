package com.codefresher.tuananh.fragment

import android.graphics.Insets.add
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.codefresher.tuananh.R
import com.codefresher.tuananh.ViewPagerAdapter
import com.codefresher.tuananh.adapter.RecommendAdapter
import com.codefresher.tuananh.adapter.RecyclerView1Adapter
import com.codefresher.tuananh.adapter.RecyclerView2Adapter
import com.codefresher.tuananh.databinding.FragmentHomeBinding
import com.codefresher.tuananh.model.model1
import com.codefresher.tuananh.model.model2
import com.codefresher.tuananh.model.recommend


class HomeFragment : Fragment() {
    private var slideBinding: FragmentHomeBinding? = null
    private val binding get() = slideBinding!!
    private var imgList = mutableListOf<Int>()
    private var listModel1 = arrayListOf<model1>()
    private var listModel2 = arrayListOf<model2>()
    private var listRecommend = arrayListOf<recommend>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        slideBinding = FragmentHomeBinding.inflate(inflater, container, false)

        postToList()
        binding.viewPager2.adapter = ViewPagerAdapter(imgList)
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.indicator.setViewPager(binding.viewPager2)
        binding.recyclerView1.adapter = RecyclerView1Adapter(listModel1)
        binding.recyclerView2.adapter = RecyclerView2Adapter(listModel2)
        binding.recyclerViewRecommend.adapter = RecommendAdapter(listRecommend)




        return binding.root


    }

    private fun postToList() {
        imgList.clear()

        for (i: Int in 1..5) {
            addToList(R.drawable.item_slide)
        }

        listModel1.clear()
        for (i: Int in 1..12) {
            addToListRecyclerView1("banh de", R.drawable.item_slide)
        }

        listModel2.clear()
        for (i: Int in 1..12) {
            addToListRecyclerView2(
                getString(R.string.title),
                R.drawable.tiger_sugar,
                "0.14km . 20 min",
                getString(R.string.rating)
            )
        }

        listRecommend.clear()
        for (i:Int in 1..5){
            addToListRecommend(R.drawable.mixue,"4.2"," Mixue, Hoàng Ngân",
            "Boba World, Sweet Tooth", "0,02 km")
        }
    }

    private fun addToList(images: Int) {
        imgList.add(images)

    }

    private fun addToListRecyclerView1(title: String, img: Int) {
        listModel1.add(model1(title, img))
    }

    private fun addToListRecyclerView2(
        title: String,
        img: Int,
        distanceTime: String,
        rating: String
    ) {
        listModel2.add(model2(title, img, distanceTime, rating))
    }

    private fun addToListRecommend(
        img: Int, rate: String, nameAndAddress: String,
        hashTag: String, distance: String
    ) {
        listRecommend.add(
            recommend(
                img, rate, nameAndAddress, hashTag, distance
            )
        )
    }

}