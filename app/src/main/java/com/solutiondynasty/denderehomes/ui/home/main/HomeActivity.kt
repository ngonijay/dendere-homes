package com.solutiondynasty.denderehomes.ui.home.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.solutiondynasty.denderehomes.R
import com.solutiondynasty.denderehomes.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var navController  : NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get NavHostFragment and NavController
        val navHostFrag = supportFragmentManager.findFragmentById(R.id.nav_host_frag) as NavHostFragment
        navController = navHostFrag.navController

        // Define AppBarConfiguration
        val topLevelDestinations = setOf(R.id.fragmentRequests, R.id.fragmentNotifications, R.id.fragmentMyListings, R.id.fragmentProfile)
        val appBarConfiguration = AppBarConfiguration(topLevelDestinations)

        // Connect Toolbar with NavController
        binding.activityMainToolbar.setupWithNavController(navController, appBarConfiguration)

        // Connect BottomNavigationView with NavController
        binding.bottomNavView.setupWithNavController(navController)
    }
}