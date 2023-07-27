package com.example.ec3fmb.ui.fragments

import android.content.res.ColorStateList
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.ec3fmb.databinding.ItemEc3Binding
import com.example.ec3fmb.model.ec3

class RVEc3ListAdapter(var ec3: List<ec3>): RecyclerView.Adapter<Ec3VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Ec3VH {
        val binding = ItemEc3Binding.inflate(LayoutInflater.from(parent.context), parent, false )
        return Ec3VH(binding)
    }

    override fun getItemCount(): Int = ec3.size

    override fun onBindViewHolder(holder: Ec3VH, position: Int) {
        holder.bind(ec3[position])
    }
}

class Ec3VH(private val binding: ItemEc3Binding): ViewHolder(binding.root){
    fun bind(ec: ec3) {
        binding.txtEc3Title.text = ec.title
        binding.txtContentEc3.text = ec.content

        val labelString = ec.labels.joinToString("|")
        binding.txtLablesEc3.text = labelString
        binding.txtCreatedonEc3.text = ec.createdOn

        binding.cvItemEc3.setCardBackgroundColor(ColorStateList.valueOf(ec.getColor()))
    }

}