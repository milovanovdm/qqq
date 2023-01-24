package com.egoistenoksapplication.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoistenoksapplication.app.modules.home.`data`.model.HomeModel
import com.egoistenoksapplication.app.modules.home.`data`.model.ListfacebookRowModel
import com.egoistenoksapplication.app.modules.home.`data`.model.ListgoogleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val listgoogleList: MutableLiveData<MutableList<ListgoogleRowModel>> =
      MutableLiveData(mutableListOf())

  val listfacebookList: MutableLiveData<MutableList<ListfacebookRowModel>> =
      MutableLiveData(mutableListOf())
}
