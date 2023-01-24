package com.egoistenoksapplication.app.modules.apply.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listfacebook1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUIUXDesigner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4500_m)

)
