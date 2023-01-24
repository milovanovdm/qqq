package com.egoistenoksapplication.app.modules.massage.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListavatarFiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRozanneBarrienFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_steave)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThenewLeanstFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_move_in_some_sp)

)
