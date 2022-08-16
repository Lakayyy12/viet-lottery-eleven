package com.application.vietlottereleven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var exit = 0

    private var btn1 : TextView? = null
    private var btn2 : TextView? = null
    private var btn3 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            val intent = Intent(this, ContentPage::class.java)
            startActivity(intent)
        }

        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener{
            val intent = Intent(this, PrivacyPolicyPage::class.java)
            startActivity(intent)
        }

        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener{
            val intent = Intent(this, TermsAndConditionPage::class.java)
            startActivity(intent)
        }

    }
    override fun onBackPressed() {
        if (exit == 0){
            exit = 1
            Toast.makeText(this,"BẤM ĐÔI ĐỂ Thoá", Toast.LENGTH_SHORT).show()
        }else{
            super.finishAffinity()
        }
    }
}