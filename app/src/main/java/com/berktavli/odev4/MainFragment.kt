package com.berktavli.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.berktavli.odev4.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding : FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)

        binding.buttonA.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.actionA)
        }
        binding.buttonX.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.actionX)
        }
        return binding.root
    }
}