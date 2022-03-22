package com.example.kingbus1.main


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kingbus1.R
import com.example.kingbus1.fragment.InWayPointFragment
import com.example.kingbus1.fragment.SelectDateFragment
import kotlinx.android.synthetic.main.activity_main_estimate.*


class MainEstimateActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_main_estimate))

        supportFragmentManager.beginTransaction()
            .replace(R.id.selectWithDriver, MainEstimateFragment())
            .commit()


        nextButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.selectWithDriver, MainEstimateDetailFragment())
                .commit()
        }


    }




}