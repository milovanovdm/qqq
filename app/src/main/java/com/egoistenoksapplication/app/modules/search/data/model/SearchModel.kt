package com.egoistenoksapplication.app.modules.search.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineteen: String? = MyApp.getInstance().resources.getString(R.string.lbl19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirteenValue: String? = null
)
