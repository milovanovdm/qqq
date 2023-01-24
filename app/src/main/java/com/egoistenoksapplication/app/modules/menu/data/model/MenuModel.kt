package com.egoistenoksapplication.app.modules.menu.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdomShafi: String? = MyApp.getInstance().resources.getString(R.string.lbl_adom_shafi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_hellobesnik_gma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.msg19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionHis: String? = MyApp.getInstance().resources.getString(R.string.lbl_82)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl31)

)
