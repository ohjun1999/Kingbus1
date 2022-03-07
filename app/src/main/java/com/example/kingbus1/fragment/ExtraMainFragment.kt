package com.example.kingbus1.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.kingbus1.ExtraActivity
import com.example.kingbus1.databinding.FragmentMainRoundTripBinding

class ExtraMainFragment : Fragment() {
    private var _binding: FragmentMainRoundTripBinding? = null
    private val binding get() = _binding!!
    var extraActivity: ExtraActivity? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        extraActivity = context as ExtraActivity


    }
}

