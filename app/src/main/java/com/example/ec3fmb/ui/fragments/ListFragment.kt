package com.example.ec3fmb.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ec3fmb.R
import com.example.ec3fmb.databinding.FragmentListBinding
import com.example.ec3fmb.model.getData
import com.example.ec3fmb.ui.viewmodels.Ec3ListViewModel

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var viewModel: Ec3ListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[Ec3ListViewModel::class.java]

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVEc3ListAdapter(listOf())
        binding.rvEc3List.adapter = adapter
        viewModel.ec3.observe(requireActivity()){
            adapter.ec3 = it
            adapter.notifyDataSetChanged()
        }

        viewModel.getAllEc3() // lo siento profe , por alguna razon no me sale con una api externa intente a su manera pero igual
    }
}