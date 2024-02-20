package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentSayfaABinding
import com.example.homework4.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        binding.buttonBtoY.setOnClickListener {
            //val gecisY = AnasayfaFragmentDirections.sayfaAGecis()

            Navigation.findNavController(it).navigate(R.id.sayfaBtoYGecis)
        }
        return binding.root
    }


}