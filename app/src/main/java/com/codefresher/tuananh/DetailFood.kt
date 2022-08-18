package com.codefresher.tuananh

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.codefresher.tuananh.databinding.ActivityMainBinding
import com.codefresher.tuananh.databinding.DetailFoodBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class DetailFood : AppCompatActivity() {

    private lateinit var detailFood: DetailFoodBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailFood = DetailFoodBinding.inflate(layoutInflater)
        setContentView(detailFood.root)

        BottomSheetBehavior.from(detailFood.sheet1).apply {
            peekHeight=300
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }

//        detailFood.btnDialog.setOnClickListener {
//            showDialog()
//        }

//        detailFood.btnDialog.setOnClickListener {
//            detailFood.sheet1.visibility = View.INVISIBLE
//        }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        dialog.setCancelable(true)
        dialog.setContentView(R.layout.dialog_layout)
        dialog.window!!.attributes.windowAnimations = R.style.dialoanimation
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window!!.setGravity(Gravity.BOTTOM)

        dialog.show()

    }

    fun hideDialog() {
        val dialog = Dialog(this)

        dialog.dismiss()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        hideDialog()
    }
}