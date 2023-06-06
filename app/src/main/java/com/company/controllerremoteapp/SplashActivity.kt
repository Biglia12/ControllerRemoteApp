package com.company.controllerremoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //SplashScreen
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        screenSplash.setKeepOnScreenCondition { true }

        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}