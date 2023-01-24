package com.egoistenoksapplication.app.modules.massage.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MassageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMassage: String? = MyApp.getInstance().resources.getString(R.string.lbl_massage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRozanneBarrienThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tony_stark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRozanneBarrienFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_banner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThenewLeanstThree: String? = MyApp.getInstance().resources.getString(R.string.msg23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl38)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl16)

)
