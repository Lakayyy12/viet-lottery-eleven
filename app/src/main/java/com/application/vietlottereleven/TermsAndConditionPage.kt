package com.application.vietlottereleven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TermsAndConditionPage : AppCompatActivity() {

    private var btn5 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_condition_page)

        btn5 = findViewById(R.id.btn5)
        btn5?.setOnClickListener{
            onBackPressed()
        }
    }
}