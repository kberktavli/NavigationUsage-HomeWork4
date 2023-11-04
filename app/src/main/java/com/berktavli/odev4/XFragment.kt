package com.berktavli.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.berktavli.odev4.databinding.FragmentBBinding
import com.berktavli.odev4.databinding.FragmentMainBinding
import com.berktavli.odev4.databinding.FragmentXBinding

class XFragment : Fragment() {
    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentXBinding.inflate(inflater,container,false)
        binding.buttonY2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actionY2)
        }

        return binding.root
    }
}