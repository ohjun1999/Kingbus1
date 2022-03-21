package com.example.kingbus1.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentHostCallback
import com.example.kingbus1.R
import com.example.kingbus1.databinding.FragmentWayPointBinding
import kotlinx.android.synthetic.main.fragment_way_point.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class WayPointFragment : Fragment(R.layout.fragment_way_point) {

    private var binding: FragmentWayPointBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentWayPointBinding = FragmentWayPointBinding.bind(view)
        binding = fragmentWayPointBinding

        plusButton2.setOnClickListener {
            childFragmentManager.beginTransaction()
            switchFragment()

        }


    }

    var flag = 0

    fun switchFragment() {
        val transaction = childFragmentManager.beginTransaction()
        when (flag) {

            0 -> {
                transaction.replace(R.id.plusFragment2, InWayPointFragment())
                flag = 1
            }

            1 -> {
                transaction.replace(R.id.plusFragment3, InWayPointFragment())
                flag = 2
            }
            2 -> {
                transaction.replace(R.id.plusFragment4, InWayPointFragment())
                flag = 3
            }
            3 -> {
                transaction.replace(R.id.plusFragment5, InWayPointFragment())
            }
        }
        transaction.addToBackStack(null)
        transaction.commit()
    }


}


//    private fun goMyPost(){
//        binding.boardMyPost.setOnClickListener {
//            startActivity(Intent(requireContext(),BoardMyPostActivity::class.java))
//        }
//    }




