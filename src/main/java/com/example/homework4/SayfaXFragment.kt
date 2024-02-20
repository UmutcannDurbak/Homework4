package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentSayfaABinding
import com.example.homework4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        binding.buttonXtoY.setOnClickListener {
            //val gecisY = AnasayfaFragmentDirections.sayfaAGecis()

            Navigation.findNavController(it).navigate(R.id.sayfaXtoYGecis)
        }
        return binding.root
    }
}