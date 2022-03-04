package com.example.kingbus1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kingbus1.databinding.ActivityMainBinding
import com.example.kingbus1.fragment.MainOneWayFragment
import com.example.kingbus1.fragment.MainRoundTripFragment
import com.example.kingbus1.fragment.SelectDateFragment


class MainActivity : AppCompatActivity() {
    private val mainRoundTripFragment = MainRoundTripFragment()
    private var mainOneWayFragment = MainOneWayFragment()
    private var selectDateFragment = SelectDateFragment()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setContentView(view)
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.bodyFragment, mainRoundTripFragment)
        transaction.commit()
    }

    // fragmentA 에서 frameLayoutB에 fragment 추가하기 위해 호출 하는 메서드
    fun openFragmentOnSelectDate(int: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        when (int) {
            1 -> transaction.replace(R.id.selectDate, selectDateFragment)
            2 -> transaction.replace(R.id.selectDate, mainOneWayFragment)
        }
        transaction.commit()
    }

}
