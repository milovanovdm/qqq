package com.egoistenoksapplication.app.modules.massage.ui

import android.view.View
import androidx.activity.viewModels
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.appcomponents.base.BaseActivity
import com.egoistenoksapplication.app.databinding.ActivityMassageBinding
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListavatarFiveRowModel
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListavatarRowModel
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListgrouptwentynineRowModel
import com.egoistenoksapplication.app.modules.massage.`data`.viewmodel.MassageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MassageActivity : BaseActivity<ActivityMassageBinding>(R.layout.activity_massage) {
  private val viewModel: MassageVM by viewModels<MassageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listavatarAdapter = ListavatarAdapter(viewModel.listavatarList.value?:mutableListOf())
    binding.recyclerListavatar.adapter = listavatarAdapter
    listavatarAdapter.setOnItemClickListener(
    object : ListavatarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListavatarRowModel) {
        onClickRecyclerListavatar(view, position, item)
      }
    }
    )
    viewModel.listavatarList.observe(this) {
      listavatarAdapter.updateData(it)
    }
    val listavatarFiveAdapter =
    ListavatarFiveAdapter(viewModel.listavatarFiveList.value?:mutableListOf())
    binding.recyclerListavatarFive.adapter = listavatarFiveAdapter
    listavatarFiveAdapter.setOnItemClickListener(
    object : ListavatarFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListavatarFiveRowModel) {
        onClickRecyclerListavatarFive(view, position, item)
      }
    }
    )
    viewModel.listavatarFiveList.observe(this) {
      listavatarFiveAdapter.updateData(it)
    }
    val listgrouptwentynineAdapter =
    ListgrouptwentynineAdapter(viewModel.listgrouptwentynineList.value?:mutableListOf())
    binding.recyclerListgrouptwentynine.adapter = listgrouptwentynineAdapter
    listgrouptwentynineAdapter.setOnItemClickListener(
    object : ListgrouptwentynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgrouptwentynineRowModel) {
        onClickRecyclerListgrouptwentynine(view, position, item)
      }
    }
    )
    viewModel.listgrouptwentynineList.observe(this) {
      listgrouptwentynineAdapter.updateData(it)
    }
    binding.massageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListavatar(
    view: View,
    position: Int,
    item: ListavatarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListavatarFive(
    view: View,
    position: Int,
    item: ListavatarFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListgrouptwentynine(
    view: View,
    position: Int,
    item: ListgrouptwentynineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MASSAGE_ACTIVITY"

  }
}
