package com.qbo.appkea5materialdesignfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qbo.appkea5materialdesignfragments.databinding.FragmentGaleriaBinding
import com.qbo.appkea5materialdesignfragments.databinding.FragmentNotificacionesBinding


class GaleriaFragment : Fragment() {
    private var _binding: FragmentGaleriaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGaleriaBinding.inflate(inflater,
            container, false)
        binding.tvtitulogaleria.text = "ESTAMOS EN EL FRAGMENT GALERIA"
        return binding.root
    }

}