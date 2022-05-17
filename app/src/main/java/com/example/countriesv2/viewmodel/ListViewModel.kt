package com.example.countriesv2.viewmodel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countriesv2.Country

class ListViewModel {
    val countries= MutableLiveData<List<Country>>()
    val countryLoadError=MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()
    //some encapsulation stuff below
    fun refresh(){
        fetchCountries()
    }
    private fun fetchCountries(){
        val mockData=listOf(Country("CountryA"),
            Country("CountryB"),
            Country("CountryC"),
            Country("CountryD"),
            Country("CountryE"),
            Country("CountryF"),
            Country("CountryG"),
            Country("CountryH"),
            Country("CountryI"),
            Country("CountryJ"),
        )

        countryLoadError.value=false
        loading.value=false
        countries.value=mockData
    }
}