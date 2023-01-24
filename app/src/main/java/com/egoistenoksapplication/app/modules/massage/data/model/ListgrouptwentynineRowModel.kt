package com.egoistenoksapplication.app.modules.massage.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListgrouptwentynineRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRozanneBarrienSeven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_natasha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThenewLeanstSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_am_going_to_d)

)
