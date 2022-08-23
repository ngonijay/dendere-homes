package com.solutiondynasty.denderehomes.ui.home.main.mylistings

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.solutiondynasty.denderehomes.R

class MyListingsFragment : Fragment() {

    companion object {
        fun newInstance() = MyListingsFragment()
    }

    private lateinit var viewModel: MyListingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_listings_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyListingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}