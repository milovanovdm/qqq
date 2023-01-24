package com.egoistenoksapplication.app.modules.menu.ui

import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityMenuBinding
import com.egoistenoksapplication.app.modules.menu.`data`.viewmodel.MenuVM
import kotlin.String
import kotlin.Unit

class MenuActivity : BaseActivity<ActivityMenuBinding>(R.layout.activity_menu) {
  private val viewModel: MenuVM by viewModels<MenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_ACTIVITY"

  }
}
