package com.solutiondynasty.denderehomes.ui.onboarding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()

    val onBoardingLbl: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }
    val onBoardingTxt: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    val onBoardingImage: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}