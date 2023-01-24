package com.egoistenoksapplication.app.modules.searchfilter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoistenoksapplication.app.modules.searchfilter.`data`.model.SearchFilterModel
import org.koin.core.KoinComponent

class SearchFilterVM : ViewModel(), KoinComponent {
  val searchFilterModel: MutableLiveData<SearchFilterModel> = MutableLiveData(SearchFilterModel())

  var navArguments: Bundle? = null
}
