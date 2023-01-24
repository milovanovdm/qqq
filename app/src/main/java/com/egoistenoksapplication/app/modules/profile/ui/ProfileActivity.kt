package com.egoistenoksapplication.app.modules.profile.ui

import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityProfileBinding
import com.egoistenoksapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"

  }
}
