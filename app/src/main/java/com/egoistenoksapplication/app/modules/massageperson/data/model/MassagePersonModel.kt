package com.egoistenoksapplication.app.modules.massageperson.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MassagePersonModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRozanneBarrien: String? = MyApp.getInstance().resources.getString(R.string.lbl_anaya_sanji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowareyou: String? = MyApp.getInstance().resources.getString(R.string.lbl40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_35_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNicebro: String? = MyApp.getInstance().resources.getString(R.string.lbl41)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_34_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOkay: String? = MyApp.getInstance().resources.getString(R.string.msg24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_35_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidyouseenew: String? = MyApp.getInstance().resources.getString(R.string.msg25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_34_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOkayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_34_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMassageValue: String? = null
)
