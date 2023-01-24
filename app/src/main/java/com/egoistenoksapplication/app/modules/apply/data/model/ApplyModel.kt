package com.egoistenoksapplication.app.modules.apply.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ApplyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSerachhere: String? = MyApp.getInstance().resources.getString(R.string.lbl_serach_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularJob: String? = MyApp.getInstance().resources.getString(R.string.lbl_popular_job)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_recent_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMassage: String? = MyApp.getInstance().resources.getString(R.string.lbl_massage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUIDesignLead: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ui_design_lead)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpotify: String? = MyApp.getInstance().resources.getString(R.string.lbl_spotify)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_toronto_canada2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullTimeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_1200_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompany: String? = MyApp.getInstance().resources.getString(R.string.lbl26)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRevies: String? = MyApp.getInstance().resources.getString(R.string.lbl27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyEight: String? = MyApp.getInstance().resources.getString(R.string.msg14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.msg15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.msg16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.msg17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFigmaXdSket: String? = MyApp.getInstance().resources.getString(R.string.msg_figma_xd_sket)

)
