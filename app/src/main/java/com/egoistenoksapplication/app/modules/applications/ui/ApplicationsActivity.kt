package com.egoistenoksapplication.app.modules.applications.ui

import android.view.View
import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityApplicationsBinding
import com.egoistenoksapplication.app.modules.applications.`data`.model.ApplicationsRowModel
import com.egoistenoksapplication.app.modules.applications.`data`.viewmodel.ApplicationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ApplicationsActivity :
    BaseActivity<ActivityApplicationsBinding>(R.layout.activity_applications) {
  private val viewModel: ApplicationsVM by viewModels<ApplicationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val applicationsAdapter =
    ApplicationsAdapter(viewModel.applicationsList.value?:mutableListOf())
    binding.recyclerApplications.adapter = applicationsAdapter
    applicationsAdapter.setOnItemClickListener(
    object : ApplicationsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ApplicationsRowModel) {
        onClickRecyclerApplications(view, position, item)
      }
    }
    )
    viewModel.applicationsList.observe(this) {
      applicationsAdapter.updateData(it)
    }
    binding.applicationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerApplications(
    view: View,
    position: Int,
    item: ApplicationsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "APPLICATIONS_ACTIVITY"

  }
}
