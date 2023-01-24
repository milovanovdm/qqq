package com.egoistenoksapplication.app.modules.applications.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ApplicationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtySix: String? = MyApp.getInstance().resources.getString(R.string.lbl35)

)
