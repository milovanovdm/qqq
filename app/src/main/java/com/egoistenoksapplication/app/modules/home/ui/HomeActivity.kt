package com.egoistenoksapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityHomeBinding
import com.egoistenoksapplication.app.modules.home.`data`.model.ListfacebookRowModel
import com.egoistenoksapplication.app.modules.home.`data`.model.ListgoogleRowModel
import com.egoistenoksapplication.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgoogleAdapter = ListgoogleAdapter(viewModel.listgoogleList.value?:mutableListOf())
    binding.recyclerListgoogle.adapter = listgoogleAdapter
    listgoogleAdapter.setOnItemClickListener(
    object : ListgoogleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgoogleRowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListfacebookRowModel) {
        onClickRecyclerListfacebook(view, position, item)
      }
    }
    )
    viewModel.listfacebookList.observe(this) {
      listfacebookAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListgoogle(
    view: View,
    position: Int,
    item: ListgoogleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListfacebook(
    view: View,
    position: Int,
    item: ListfacebookRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
