package com.egoistenoksapplication.app.modules.apply.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listgoogle1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeadProductMa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lead_product_ma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_2500_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_toronto_canada)

)
