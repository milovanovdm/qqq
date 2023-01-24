package com.egoistenoksapplication.app.modules.applications.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ApplicationsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebookOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUIUXDesigner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_toronto_canada)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_4500_monthly)

)
