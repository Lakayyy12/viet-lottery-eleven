package com.application.vietlottereleven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_content_page.*

class ContentPage : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Details>

    private lateinit var imageId: Array<Int>
    private lateinit var heading: Array<String>
    private lateinit var briefNews: Array<String>

    private var btn11 : TextView? = null
    private var btn22 : TextView? = null
    private var btn33 : TextView? = null
    private var btn44 : TextView? = null

    private var btnB : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_page)

        imageId = arrayOf(R.drawable.logo11, R.drawable.logo11, R.drawable.logo11, R.drawable.logo11, R.drawable.logo11, R.drawable.logo11)
        heading = arrayOf(getString(R.string.con1),
            getString(R.string.con2),
            getString(R.string.con3),
            getString(R.string.con4),
            getString(R.string.con5),
            getString(R.string.con6)
        )
        briefNews = arrayOf(
            getString(R.string.con11),
            getString(R.string.con22),
            getString(R.string.con33),
            getString(R.string.con44),
            getString(R.string.con55),
            getString(R.string.con66)
        )
        newRecyclerView = findViewById(R.id.recyclerItems)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Details>()
        getUserdata()

        btn11 = findViewById(R.id.btn11)
        btn22 = findViewById(R.id.btn22)
        btn33 = findViewById(R.id.btn33)
        btn44 = findViewById(R.id.btn44)

        btn11?.setOnClickListener{
            Navigator.showInfoDialog(this,getString(R.string.t1))
        }
        btn22?.setOnClickListener{
            Navigator.showInfoDialog(this,getString(R.string.t2))
        }
        btn33?.setOnClickListener{
            Navigator.showInfoDialog(this,getString(R.string.t3))
        }
        btn44?.setOnClickListener{
            Navigator.showInfoDialog(this,getString(R.string.t4))
        }
        btnB = findViewById(R.id.btnB)
        btnB?.setOnClickListener{
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
    }
    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = Details(imageId[i], heading[i], briefNews[i])
            newArrayList.add(news)
        }
        val adapter = MyAdapter2(newArrayList)
        newRecyclerView.adapter = adapter
    }
}