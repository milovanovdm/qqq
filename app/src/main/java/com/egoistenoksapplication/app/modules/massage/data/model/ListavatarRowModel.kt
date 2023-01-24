package com.egoistenoksapplication.app.modules.massage.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListavatarRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRozanneBarrien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rozanne_barrien)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThenewLeanst: String? = MyApp.getInstance().resources.getString(R.string.msg20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)

)
