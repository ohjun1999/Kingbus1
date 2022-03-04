package com.example.kingbus1.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kingbus1.MainActivity
import com.example.kingbus1.databinding.FragmentMainRoundTripBinding


var frontFragment = SelectDateFragment()
var backFragment = MainOneWayFragment()


class MainRoundTripFragment : Fragment() {
    private var _binding: FragmentMainRoundTripBinding? = null
    private val binding get() = _binding!!
    var mainActivity: MainActivity? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainRoundTripBinding.inflate(inflater, container, false)
        binding.btnRoundTrip.setOnClickListener {
            mainActivity!!.openFragmentOnSelectDate(1)
        }
        binding.btnOneWay.setOnClickListener {
            mainActivity!!.openFragmentOnSelectDate(2)
        }
        return binding.root
    }
}