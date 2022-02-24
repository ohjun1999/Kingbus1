package com.example.kingbus1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_sign_up_accept_terms.*

class SignUpTermsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_accept_terms)

        termsOfUseCheckBox.setOnClickListener { onCheckChanged(termsOfUseCheckBox) }
        privacyCheckBox.setOnClickListener { onCheckChanged(privacyCheckBox) }


    }

    private fun onCheckChanged(compoundButton: CompoundButton) {
        when (compoundButton.id) {
            R.id.everyAcceptTermsCheckBox -> {
                if (everyAcceptTermsCheckBox.isChecked) {
                    termsOfUseCheckBox.isChecked = true
                    privacyCheckBox.isChecked = true
                } else {
                    termsOfUseCheckBox.isChecked = false
                    privacyCheckBox.isChecked = false
                }
            }
            else -> {
                everyAcceptTermsCheckBox.isChecked = (
                        termsOfUseCheckBox.isChecked
                                && privacyCheckBox.isChecked)
            }
        }
    }
}


