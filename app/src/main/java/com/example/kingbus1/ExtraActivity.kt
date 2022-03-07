package com.example.kingbus1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kingbus1.databinding.ActivityMainBinding
import com.example.kingbus1.fragment.ExtraMainFragment

class ExtraActivity : AppCompatActivity() {

    private val extraMainFragment = ExtraMainFragment()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setContentView(view)
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.bodyFragment, extraMainFragment)
        transaction.commit()
    }
}