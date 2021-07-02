package com.qbo.appkea5materialdesignfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qbo.appkea5materialdesignfragments.databinding.FragmentNotificacionesBinding
import com.qbo.appkea5materialdesignfragments.databinding.FragmentPrincipalBinding


class NotificacionesFragment : Fragment() {
    private var _binding: FragmentNotificacionesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNotificacionesBinding.inflate(inflater,
            container, false)
        binding.tvtitulonotif.text = "ESTAMOS EN EL FRAGMENT DE NOTIFICACIONES"
        return binding.root
    }

}