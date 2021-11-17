package com.rizkirafiif_19104010.xim2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rizkirafiif_19104010.xim2.databinding.FragmentPractice5ReadDataBinding

/**
 * A simple [Fragment] subclass.
 * Use the [Practice5ReadDataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Practice5ReadDataFragment : Fragment() {
    private lateinit var binding: FragmentPractice5ReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPractice5ReadDataBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null){
            val myName = arguments?.getString(EXTRA_NAMA)
            binding.tvMyData.text = "Nama Saya\t: $myName \nNIM Saya\t: $nim"
        }

        binding.btnKembaliBeranda.setOnClickListener {
            startActivity(Intent(activity, MainActivity::class.java))
        }

    }

    var nim: Int? = null
    companion object {
        var EXTRA_NAMA = ""
    }
}