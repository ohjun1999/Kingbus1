package com.example.kingbus1

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_estimate.*

//import androidx.fragment.app.FragmentTransaction
//import com.example.kingbus1.databinding.ActivityMainBinding
//import com.example.kingbus1.fragment.MainOneWayFragment
//import com.example.kingbus1.fragment.MainRoundTripFragment
//import com.example.kingbus1.fragment.SelectDateFragment


class MainActivity : AppCompatActivity() {
    //    private val mainRoundTripFragment = MainRoundTripFragment()
//    private var mainOneWayFragment = MainOneWayFragment()
//    private var selectDateFragment = SelectDateFragment()
//    lateinit var binding : ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_main))

        btnOneWay.setOnClickListener {
            selectDate1.setTransitionVisibility(View.INVISIBLE)
            selectDate2.setTransitionVisibility(View.VISIBLE)

        }

        btnRoundTrip.setOnClickListener {
            selectDate1.setTransitionVisibility(View.VISIBLE)
            selectDate2.setTransitionVisibility(View.INVISIBLE)
        }

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)

//        setContentView(view)
//        val transaction = supportFragmentManager.beginTransaction()
//            .replace(R.id.bodyFragment, mainRoundTripFragment)
//        transaction.commit()
    }

    // fragmentA 에서 frameLayoutB에 fragment 추가하기 위해 호출 하는 메서드
//    fun openFragmentOnSelectDate(int: Int) {
//        val transaction = supportFragmentManager.beginTransaction()
//        when (int) {
//            0 -> transaction.replace(R.id.selectDate, selectDateFragment)
//            1 -> transaction.replace(R.id.selectDate, selectDateFragment)
//            2 -> transaction.replace(R.id.selectDate, mainOneWayFragment)
//        }
//        transaction.commit()
//    }

}
