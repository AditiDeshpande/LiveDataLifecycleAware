package com.example.livedatalifecycleaware.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*
Create LiveData objects

LiveData is a wrapper that can be used with any data, including
objects that implement Collections , such as List. A LiveData object
usually stored within ViewModel object and accessed via getter method
 */

/*
*Note: Make sure to store LiveData object that update the UI in
* ViewModel objects , as opposed to activity/fragment, for foll
* reasons:
* 1. To avoid bloated activities and frag.
* 2. To decouple LiveData instances from specific activity/frag
 */
class NameViewModel : ViewModel(){

    //Create a LiveData with a String
    //Initially the data in a LiveData object is not set

    val currentName: MutableLiveData<String> by lazy{
        MutableLiveData<String> ()
    }

    //Rest of the ViewModel

}