package com.solutiondynasty.denderehomes.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.solutiondynasty.denderehomes.databinding.FragmentOnBoardingBinding

/**
 * A placeholder fragment containing a simple view.
 */
class OnBoardingItemFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel
    private var _binding: FragmentOnBoardingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        val root = binding.root

        val onBoardingLbl: TextView = binding.onboardingLbl
        val onBoardingTxt: TextView = binding.onBoardingTxt
        val onBoardingImageView: ImageView = binding.onBoardingImageView

        pageViewModel.onBoardingLbl.observe(viewLifecycleOwner, Observer {
            onBoardingTxt.text = it
        })

        pageViewModel.onBoardingTxt.observe(viewLifecycleOwner, Observer {
            onBoardingTxt.text = it
        })

        pageViewModel.onBoardingImage.observe(viewLifecycleOwner, Observer {
            onBoardingTxt.text = it
        })

        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): OnBoardingItemFragment {
            return OnBoardingItemFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}