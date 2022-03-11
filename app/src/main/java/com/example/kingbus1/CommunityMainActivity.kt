package com.example.kingbus1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OneShotPreDrawListener.add
import com.example.kingbus1.fragment.CommunityFreeFragment
import kotlinx.android.synthetic.main.activity_community_main.*
import kotlinx.android.synthetic.main.activity_login.*

class CommunityMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_community_main))


        writeButton.setOnClickListener {
            val intent = Intent(this, WritePageActivity::class.java)
            startActivity(intent)

            val mFragment: CommunityFreeFragment = CommunityFreeFragment()

            // 프래그먼트를 액티비티에 넣기 위한 트랜잭션 객체 생성
            val transaction = supportFragmentManager.beginTransaction()

// 액티비티에 넣을 프래그먼트와 넣을 위치를 트랜잭션에 추가
            transaction.add(R.id.myFragment, mFragment)

// 트랜잭션을 수행
            transaction.commit()

        }

    }
}
