package com.egoistenoksapplication.app.modules.searchfilter.ui

import androidx.fragment.app.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.egoistenoksapplication.app.databinding.BottomsheetSearchFilterBinding
import com.egoistenoksapplication.app.modules.searchfilter.`data`.viewmodel.SearchFilterVM
import kotlin.String
import kotlin.Unit

class SearchFilterBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSearchFilterBinding>(R.layout.bottomsheet_search_filter)
    {
  private val viewModel: SearchFilterVM by viewModels<SearchFilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchFilterVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_FILTER_BOTTOMSHEET"

  }
}
