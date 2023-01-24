package com.egoistenoksapplication.app.modules.apply.ui

import android.view.View
import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityApplyBinding
import com.egoistenoksapplication.app.modules.apply.`data`.model.Listfacebook1RowModel
import com.egoistenoksapplication.app.modules.apply.`data`.model.Listgoogle1RowModel
import com.egoistenoksapplication.app.modules.apply.`data`.viewmodel.ApplyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ApplyActivity : BaseActivity<ActivityApplyBinding>(R.layout.activity_apply) {
  private val viewModel: ApplyVM by viewModels<ApplyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgoogleAdapter = ListgoogleAdapter(viewModel.listgoogleList.value?:mutableListOf())
    binding.recyclerListgoogle.adapter = listgoogleAdapter
    listgoogleAdapter.setOnItemClickListener(
    object : ListgoogleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listgoogle1RowModel) {
        onClickRecyclerListgoogle(view, position, item)
      }
    }
    )
    viewModel.listgoogleList.observe(this) {
      listgoogleAdapter.updateData(it)
    }
    val listfacebookAdapter =
    ListfacebookAdapter(viewModel.listfacebookList.value?:mutableListOf())
    binding.recyclerListfacebook.adapter = listfacebookAdapter
    listfacebookAdapter.setOnItemClickListener(
    object : ListfacebookAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfacebook1RowModel) {
        onClickRecyclerListfacebook(view, position, item)
      }
    }
    )
    viewModel.listfacebookList.observe(this) {
      listfacebookAdapter.updateData(it)
    }
    binding.applyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListgoogle(
    view: View,
    position: Int,
    item: Listgoogle1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListfacebook(
    view: View,
    position: Int,
    item: Listfacebook1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "APPLY_ACTIVITY"

  }
}
