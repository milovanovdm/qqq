package com.egoistenoksapplication.app.modules.applications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoistenoksapplication.app.modules.applications.`data`.model.ApplicationsModel
import com.egoistenoksapplication.app.modules.applications.`data`.model.ApplicationsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ApplicationsVM : ViewModel(), KoinComponent {
  val applicationsModel: MutableLiveData<ApplicationsModel> = MutableLiveData(ApplicationsModel())

  var navArguments: Bundle? = null

  val applicationsList: MutableLiveData<MutableList<ApplicationsRowModel>> =
      MutableLiveData(mutableListOf())
}
