package com.egoistenoksapplication.app.modules.massageperson.ui

import android.view.View
import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityMassagePersonBinding
import com.egoistenoksapplication.app.modules.massageperson.`data`.model.MassagePersonRowModel
import com.egoistenoksapplication.app.modules.massageperson.`data`.viewmodel.MassagePersonVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MassagePersonActivity :
    BaseActivity<ActivityMassagePersonBinding>(R.layout.activity_massage_person) {
  private val viewModel: MassagePersonVM by viewModels<MassagePersonVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val massagePersonAdapter =
    MassagePersonAdapter(viewModel.massagePersonList.value?:mutableListOf())
    binding.recyclerMassagePerson.adapter = massagePersonAdapter
    massagePersonAdapter.setOnItemClickListener(
    object : MassagePersonAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MassagePersonRowModel) {
        onClickRecyclerMassagePerson(view, position, item)
      }
    }
    )
    viewModel.massagePersonList.observe(this) {
      massagePersonAdapter.updateData(it)
    }
    binding.massagePersonVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMassagePerson(
    view: View,
    position: Int,
    item: MassagePersonRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MASSAGE_PERSON_ACTIVITY"

  }
}
