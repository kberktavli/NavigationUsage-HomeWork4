package com.berktavli.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.berktavli.odev4.databinding.ActivityMainBinding
import com.berktavli.odev4.databinding.FragmentYBinding
import com.google.android.material.snackbar.Snackbar

class YFragment : Fragment() {
    private lateinit var binding: FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentYBinding.inflate(inflater,container,false)

        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textView5,"Geri dönmek mi istiyorsunuz ?",Snackbar.LENGTH_LONG)
                        .setAction("Evet"){
                            isEnabled = false
                            requireView().findNavController().navigate(R.id.actionYtoMain)
                            /*
                            Geri tuşu işlemi zaten mevcut fragmenti kapatıp bir önceki fragmente
                            dönmek için kullanılırken, aynı zamanda başka bir fragmente geçiş
                            yapmaya çalışmak, bu işlemleri uyumsuz hale getirebilir ve
                            uygulamanızın çökmesine yol açabilir.
                            Navigation.findNavController(it).navigate(R.id.actionYtoMain)
                             */
                        }.show()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)

        return binding.root
    }
}