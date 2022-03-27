package com.example.aa15009lab01.ui.salary

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aa15009lab01.R

class SalaryFragment : Fragment() {

    companion object {
        fun newInstance() = SalaryFragment()
    }

    private lateinit var viewModel: SalaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.salary_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SalaryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}