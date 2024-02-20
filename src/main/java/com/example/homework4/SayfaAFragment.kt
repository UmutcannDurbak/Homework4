package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        binding.buttonB.setOnClickListener {
            //val gecisB = AnasayfaFragmentDirections.sayfaAGecis()

            Navigation.findNavController(it).navigate(R.id.sayfaBGecis)
        }

        return binding.root
    }


}