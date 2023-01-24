package com.egoistenoksapplication.app.modules.searchfilter.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchFilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.msg10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUIUXDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_ui_ux_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.msg11)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCanda: String? = MyApp.getInstance().resources.getString(R.string.lbl_canda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_2k_5k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySix: String? = MyApp.getInstance().resources.getString(R.string.msg12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFT: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPT: String? = MyApp.getInstance().resources.getString(R.string.lbl_part_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCO: String? = MyApp.getInstance().resources.getString(R.string.lbl_contract)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl24)

)
