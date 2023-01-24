package com.egoistenoksapplication.app.modules.massage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListavatarFiveRowModel
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListavatarRowModel
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListgrouptwentynineRowModel
import com.egoistenoksapplication.app.modules.massage.`data`.model.MassageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MassageVM : ViewModel(), KoinComponent {
  val massageModel: MutableLiveData<MassageModel> = MutableLiveData(MassageModel())

  var navArguments: Bundle? = null

  val listavatarList: MutableLiveData<MutableList<ListavatarRowModel>> =
      MutableLiveData(mutableListOf())

  val listavatarFiveList: MutableLiveData<MutableList<ListavatarFiveRowModel>> =
      MutableLiveData(mutableListOf())

  val listgrouptwentynineList: MutableLiveData<MutableList<ListgrouptwentynineRowModel>> =
      MutableLiveData(mutableListOf())
}
