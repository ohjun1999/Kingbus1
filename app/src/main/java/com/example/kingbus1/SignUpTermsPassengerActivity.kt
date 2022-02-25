package com.example.kingbus1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up_accept_terms.*

class SignUpTermsPassengerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_accept_terms_passenger)

        //이용 약관 모두선택/약관동의 선택/개인정보 이용 동의 선택
        everyAcceptTermsCheckBox.setOnClickListener { onCheckChanged(everyAcceptTermsCheckBox) }
        termsOfUseCheckBox.setOnClickListener { onCheckChanged(termsOfUseCheckBox) }
        privacyCheckBox.setOnClickListener { onCheckChanged(privacyCheckBox) }

        //클릭시 회원 정보 입력으로 이동
        agreeButton.setOnClickListener {


            if (everyAcceptTermsCheckBox.isChecked) {

                val intent = Intent(this, SignUpPassengerInfoActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "동의되지 않은 항목이 있습니다.",Toast.LENGTH_SHORT).show()
            }


        }


    }


    //이용 약관 모두선택/약관동의 선택/개인정보 이용 동의 선택
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


