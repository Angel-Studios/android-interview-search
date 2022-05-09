package com.angel.itunessearch.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.angel.itunessearch.R

class MainActivityFragmentView : Fragment() {

    companion object {
        fun newInstance() = MainActivityFragmentView()
    }

    private lateinit var viewModel: MainActivityFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main_activity_fragment_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainActivityFragmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}