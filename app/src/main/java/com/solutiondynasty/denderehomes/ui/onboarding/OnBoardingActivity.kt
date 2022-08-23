package com.solutiondynasty.denderehomes.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.solutiondynasty.denderehomes.databinding.ActivityOnBoardingBinding
import com.solutiondynasty.denderehomes.ui.auth.AuthenticationActivity


class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpview()
        //todo: post list of onbarding



    }

    private fun setUpview() {
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        binding.nextLbl.setOnClickListener {
            viewPager.currentItem = viewPager.currentItem + 1
            binding.previousLbl.visibility = View.VISIBLE
        }

        binding.previousLbl.setOnClickListener{
            viewPager.currentItem = viewPager.currentItem - 1
        }

        binding.skipButton.setOnClickListener{
            val intent = Intent(this, AuthenticationActivity::class.java)
            startActivity(intent)
        }
    }
}