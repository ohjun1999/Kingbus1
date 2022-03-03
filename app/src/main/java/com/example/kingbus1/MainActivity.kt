package com.example.kingbus1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kingbus1.databinding.ActivityMainBinding
import com.example.kingbus1.fragment.MainOneWayFragment
import com.example.kingbus1.fragment.MainRoundTripFragment


class MainActivity : AppCompatActivity() {
    private val fragmentRoundTrip = MainRoundTripFragment()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
// bodyFragment 에 fragmentRoundTrip 로드하기
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.bodyFragment, fragmentRoundTrip)
        transaction.commit()
    }

}