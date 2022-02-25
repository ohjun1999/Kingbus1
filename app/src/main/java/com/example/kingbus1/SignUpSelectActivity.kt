package com.example.kingbus1

import android.content.Intent
import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_select_sign_up.*
import kotlinx.android.synthetic.main.activity_sign_up_accept_terms.*

class SignUpSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_sign_up)

        btnDriver.setOnClickListener {
            val intent = Intent(this, SignUpTermsActivity::class.java)
            startActivity(intent)
        }
        btnCompany.setOnClickListener {
            val intent = Intent(this, SignUpTermsCompanyActivity::class.java)
            startActivity(intent)
        }
        btnPassenger.setOnClickListener {
            val intent = Intent(this, SignUpTermsPassengerActivity::class.java)
            startActivity(intent)
        }


    }



}