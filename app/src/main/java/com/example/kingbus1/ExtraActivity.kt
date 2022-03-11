package com.example.kingbus1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kingbus1.databinding.ActivityMainBinding
import com.example.kingbus1.fragment.ExtraMainFragment
import com.example.kingbus1.fragment.SettingDriverProfileFragment

class ExtraActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra)


        setFrag(0)


    }

    fun setFrag(fragNum : Int) {

        val ft = supportFragmentManager.beginTransaction()
        when(fragNum)
        {
            0 -> {
                ft.replace(R.id.bodyFragment, ExtraMainFragment()).commit()
            }

            1 -> {
                ft.replace(R.id.bodyFragment, SettingDriverProfileFragment()).commit()
            }



        }
    }
}
