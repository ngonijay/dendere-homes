package com.solutiondynasty.denderehomes.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.solutiondynasty.denderehomes.R
import com.solutiondynasty.denderehomes.databinding.FragmentSignUpBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SignUpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding


    companion object {
        @JvmStatic
        fun newInstance() =
            SignUpFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        setUpView()
        return binding.root
    }

    private fun setUpView() {
        binding.toolbarInclude.toolBarCustomTitle.text = "Sign up"
        binding.signUpBtn.setOnClickListener{signUp()}
        binding.signInBtn.setOnClickListener{navigateToSignUp()}
    }

    private fun navigateToSignUp() {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.container, SignInFragment.newInstance())
            ?.commitNow()
    }

    private fun signUp() {

    }

}