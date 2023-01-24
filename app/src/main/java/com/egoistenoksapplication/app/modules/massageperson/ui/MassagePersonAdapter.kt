package com.egoistenoksapplication.app.modules.massageperson.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.databinding.RowMassagePersonBinding
import com.egoistenoksapplication.app.modules.massageperson.`data`.model.MassagePersonRowModel
import kotlin.Int
import kotlin.collections.List

class MassagePersonAdapter(
  var list: List<MassagePersonRowModel>
) : RecyclerView.Adapter<MassagePersonAdapter.RowMassagePersonVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMassagePersonVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_massage_person,parent,false)
    return RowMassagePersonVH(view)
  }

  override fun onBindViewHolder(holder: RowMassagePersonVH, position: Int) {
    val massagePersonRowModel = MassagePersonRowModel()
    // TODO uncomment following line after integration with data source
    // val massagePersonRowModel = list[position]
    holder.binding.massagePersonRowModel = massagePersonRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MassagePersonRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MassagePersonRowModel
    ) {
    }
  }

  inner class RowMassagePersonVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMassagePersonBinding = RowMassagePersonBinding.bind(itemView)
  }
}
