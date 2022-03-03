package com.example.kingbus1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kingbus1.R
import com.example.kingbus1.databinding.FragmentMainOneWayBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainRoundTripFragment : Fragment() {

    private var fragmentOneWayFragment = MainOneWayFragment()

    private var _binding : FragmentMainOneWayBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_round_trip, container, false)
    }

}