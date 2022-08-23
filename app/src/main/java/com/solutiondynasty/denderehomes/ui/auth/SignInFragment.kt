package com.solutiondynasty.denderehomes.ui.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.solutiondynasty.denderehomes.R
import com.solutiondynasty.denderehomes.databinding.FragmentOnBoardingBinding
import com.solutiondynasty.denderehomes.databinding.SignInFragmentBinding


class SignInFragment : Fragment() {


    companion object {
        fun newInstance() = SignInFragment()
    }

    private lateinit var binding: SignInFragmentBinding
    private lateinit var viewModel: AuthenticationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SignInFragmentBinding.inflate(inflater, container, false)
        val root = binding.root
        setUpView()
        return root
    }

    private fun setUpView() {
        binding.toolbarInclude.toolBarCustomTitle.text = "Sign in"
        binding.signInButton.setOnClickListener{signIn()}
        binding.signUpBtn.setOnClickListener{navigateToSignUp()}
        binding.ForgotPasswordTxt.setOnClickListener{navigateToForgotPassword()}
    }

    private fun navigateToForgotPassword() {

    }

    private fun navigateToSignUp() {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.container, SignUpFragment.newInstance())
            ?.commitNow()
    }

    private fun signIn() {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthenticationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}