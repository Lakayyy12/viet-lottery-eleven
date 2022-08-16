package com.application.vietlottereleven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PrivacyPolicyPage : AppCompatActivity() {

    private var btn4 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy_page)

        btn4 = findViewById(R.id.btn4)
        btn4?.setOnClickListener{
            onBackPressed()
        }
    }
}