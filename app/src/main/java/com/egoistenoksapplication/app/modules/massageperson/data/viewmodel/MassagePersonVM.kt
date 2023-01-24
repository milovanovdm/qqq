package com.egoistenoksapplication.app.modules.massageperson.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoistenoksapplication.app.modules.massageperson.`data`.model.MassagePersonModel
import com.egoistenoksapplication.app.modules.massageperson.`data`.model.MassagePersonRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MassagePersonVM : ViewModel(), KoinComponent {
  val massagePersonModel: MutableLiveData<MassagePersonModel> =
      MutableLiveData(MassagePersonModel())

  var navArguments: Bundle? = null

  val massagePersonList: MutableLiveData<MutableList<MassagePersonRowModel>> =
      MutableLiveData(mutableListOf())
}
