package com.qbo.appkea5materialdesignfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qbo.appkea5materialdesignfragments.databinding.FragmentConsultasBinding
import com.qbo.appkea5materialdesignfragments.databinding.FragmentGaleriaBinding


class ConsultasFragment : Fragment() {

    private var _binding: FragmentConsultasBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConsultasBinding.inflate(inflater,
            container, false)
        binding.tvtituloconsultas.text = "ESTAMOS EN EL FRAGMENT DE CONSULTAS"
        return binding.root
    }


}