package com.egoistenoksapplication.app.modules.profile.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdomShafi: String? = MyApp.getInstance().resources.getString(R.string.lbl_adom_shafi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFour: String? = MyApp.getInstance().resources.getString(R.string.msg19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
