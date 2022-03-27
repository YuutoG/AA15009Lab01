package com.example.aa15009lab01.ui.perfil

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.aa15009lab01.R
import com.example.aa15009lab01.databinding.FragmentHomeBinding
import com.example.aa15009lab01.databinding.PerfilFragmentBinding
import com.example.aa15009lab01.ui.home.HomeViewModel

class PerfilFragment : Fragment() {
    private var _binding: PerfilFragmentBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = PerfilFragment()
    }

    private lateinit var viewModel: PerfilViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = PerfilFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PerfilViewModel::class.java)
        // TODO: Use the ViewModel
    }

}