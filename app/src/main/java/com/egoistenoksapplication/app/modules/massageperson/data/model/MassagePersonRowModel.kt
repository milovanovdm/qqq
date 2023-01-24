package com.egoistenoksapplication.app.modules.massageperson.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MassagePersonRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHello: String? = MyApp.getInstance().resources.getString(R.string.lbl39)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_34_pm)

)
