package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        binding.buttonA.setOnClickListener {
            val gecisA = AnasayfaFragmentDirections.sayfaAGecis()

            Navigation.findNavController(it).navigate(gecisA)
        }

        binding.buttonX.setOnClickListener {
            val gecisX = AnasayfaFragmentDirections.sayfaXGecis()

            Navigation.findNavController(it).navigate(gecisX)
        }
        return binding.root
    }


}