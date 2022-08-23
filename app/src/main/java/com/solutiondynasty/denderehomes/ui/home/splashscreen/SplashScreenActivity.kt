package com.solutiondynasty.denderehomes.ui.home.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solutiondynasty.denderehomes.databinding.ActivityOnBoardingBinding
import com.solutiondynasty.denderehomes.databinding.ActivitySplashScreenBinding
import com.solutiondynasty.denderehomes.ui.onboarding.OnBoardingActivity

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding

    private var isUserOnBoarded: Boolean = false;
    private var isUserLoggedIn: Boolean = false;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (isUserOnBoarded)
            if (isUserLoggedIn) launchHome(); else launchAuth()
        else launchOnBoarding();
    }

    private fun launchAuth() {
        TODO("Not yet implemented")
    }

    private fun launchHome() {
        TODO("Not yet implemented")
    }

    private fun launchOnBoarding() {
        val intent = Intent(this, OnBoardingActivity::class.java)
        // To pass any data to next activity
        //intent.putExtra("keyIdentifier", value)
        // start your next activity
        startActivity(intent)
    }
}