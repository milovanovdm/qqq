package com.egoistenoksapplication.app.modules.apply.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoistenoksapplication.app.modules.apply.`data`.model.ApplyModel
import com.egoistenoksapplication.app.modules.apply.`data`.model.Listfacebook1RowModel
import com.egoistenoksapplication.app.modules.apply.`data`.model.Listgoogle1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ApplyVM : ViewModel(), KoinComponent {
  val applyModel: MutableLiveData<ApplyModel> = MutableLiveData(ApplyModel())

  var navArguments: Bundle? = null

  val listgoogleList: MutableLiveData<MutableList<Listgoogle1RowModel>> =
      MutableLiveData(mutableListOf())

  val listfacebookList: MutableLiveData<MutableList<Listfacebook1RowModel>> =
      MutableLiveData(mutableListOf())
}
