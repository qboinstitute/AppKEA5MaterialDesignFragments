package com.qbo.appkea5materialdesignfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.qbo.appkea5materialdesignfragments.adapter.AndroidAdapter
import com.qbo.appkea5materialdesignfragments.databinding.ActivityListaBinding
import com.qbo.appkea5materialdesignfragments.datos.DatosAndroid

class ListaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvandroid.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvandroid.adapter =
            AndroidAdapter(DatosAndroid().listaVersionesAndroid())
    }
}