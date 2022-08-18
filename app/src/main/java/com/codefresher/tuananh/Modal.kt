package com.codefresher.tuananh

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.codefresher.tuananh.databinding.ActivityModalBinding
import com.codefresher.tuananh.databinding.DetailFoodBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class Modal : AppCompatActivity() {
    private lateinit var modalBinding: ActivityModalBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        modalBinding = ActivityModalBinding.inflate(layoutInflater)
        setContentView(modalBinding.root)


        modalBinding.btnShow.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.item_modal,null)
            val dialog = BottomSheetDialog(this)
            dialog.setCancelable(true)

            dialog.setContentView(view)
            dialog.show()
        }
    }

    override fun onStart() {
        super.onStart()

    }
}