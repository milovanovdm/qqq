package com.egoistenoksapplication.app.modules.form.`data`.model

import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJobApply: String? = MyApp.getInstance().resources.getString(R.string.lbl_job_apply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUSA: String? = MyApp.getInstance().resources.getString(R.string.lbl_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMassage: String? = MyApp.getInstance().resources.getString(R.string.lbl_massage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCV: String? = MyApp.getInstance().resources.getString(R.string.lbl_cv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
