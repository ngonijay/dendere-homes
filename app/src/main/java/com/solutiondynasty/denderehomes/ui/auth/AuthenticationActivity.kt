package com.solutiondynasty.denderehomes.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solutiondynasty.denderehomes.R

class AuthenticationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authantication_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SignInFragment.newInstance())
                .commitNow()
        }
    }
}