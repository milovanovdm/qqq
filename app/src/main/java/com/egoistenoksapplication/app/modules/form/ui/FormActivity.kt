package com.egoistenoksapplication.app.modules.form.ui

import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityFormBinding
import com.egoistenoksapplication.app.modules.form.`data`.viewmodel.FormVM
import kotlin.String
import kotlin.Unit

class FormActivity : BaseActivity<ActivityFormBinding>(R.layout.activity_form) {
  private val viewModel: FormVM by viewModels<FormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.formVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FORM_ACTIVITY"

  }
}
