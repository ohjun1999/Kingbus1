package com.example.kingbus1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signUpButton.setOnClickListener {
            val intent = Intent(this, SignUpSelectActivity::class.java)
            startActivity(intent)


            //Retrofit

            var retrofit = Retrofit.Builder()

                .baseUrl("kingbus.co.kr")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            var loginService = retrofit.create(LoginService::class.java)


            loginButton.setOnClickListener {
                var textId = firstEditText.text.toString()
                var textPw = secondEditText.text.toString()

                loginService.requestLogin(textId, textPw).enqueue(object: Callback<Login>{
                    override fun onResponse(call: Call<Login>, response: Response<Login>) {
                        //웹 통신에 성공했을 때 응답값을 받아옴
                        var login = response.body()

                    }

                    override fun onFailure(call: Call<Login>, t: Throwable) {
                        //웹 통신에 실패 했을 때 실행되는 코드

                    }

                })


            }


        }

    }
}