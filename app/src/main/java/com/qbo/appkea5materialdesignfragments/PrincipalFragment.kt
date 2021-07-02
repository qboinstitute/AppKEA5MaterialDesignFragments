package com.qbo.appkea5materialdesignfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qbo.appkea5materialdesignfragments.databinding.FragmentGaleriaBinding
import com.qbo.appkea5materialdesignfragments.databinding.FragmentPrincipalBinding


class PrincipalFragment : Fragment() {

    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPrincipalBinding.inflate(inflater,
        container, false)
        binding.tvtituloprincipal.text = "ESTAMOS EN EL FRAGMENT PRINCIPAL"
        return binding.root
    }

}