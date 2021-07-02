package com.qbo.appkea5materialdesignfragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qbo.appkea5materialdesignfragments.databinding.ItemAndroidBinding
import com.qbo.appkea5materialdesignfragments.model.Android

class AndroidAdapter(private var listAndroid: List<Android>)
    :RecyclerView.Adapter<AndroidAdapter.ViewHolder>()
{
    inner class ViewHolder(val binding: ItemAndroidBinding)
        : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(listAndroid[position]){
                binding.tvnomandroid.text = nombre
                binding.tvapiandroid.text = api
                binding.ivandroid.setImageResource(imagen)
            }
        }
    }
    override fun getItemCount() = listAndroid.size


}