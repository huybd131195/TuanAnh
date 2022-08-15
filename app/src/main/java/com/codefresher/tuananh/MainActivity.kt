package com.codefresher.tuananh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.viewpager2.widget.ViewPager2
import com.codefresher.tuananh.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var navController: NavController


    //    private lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment

        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bttNav)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

    }
}