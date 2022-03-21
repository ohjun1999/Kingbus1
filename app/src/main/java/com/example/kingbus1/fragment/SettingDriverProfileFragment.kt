package com.example.kingbus1.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kingbus1.ExtraActivity
import com.example.kingbus1.R


class SettingDriverProfileFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_setting_profile_driver, container, false)

        return view

    }

}


