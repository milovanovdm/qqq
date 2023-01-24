package com.egoistenoksapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.databinding.RowListgoogleBinding
import com.egoistenoksapplication.app.modules.home.`data`.model.ListgoogleRowModel
import kotlin.Int
import kotlin.collections.List

class ListgoogleAdapter(
  var list: List<ListgoogleRowModel>
) : RecyclerView.Adapter<ListgoogleAdapter.RowListgoogleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgoogleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgoogle,parent,false)
    return RowListgoogleVH(view)
  }

  override fun onBindViewHolder(holder: RowListgoogleVH, position: Int) {
    val listgoogleRowModel = ListgoogleRowModel()
    // TODO uncomment following line after integration with data source
    // val listgoogleRowModel = list[position]
    holder.binding.listgoogleRowModel = listgoogleRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgoogleRowModel>) {
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
      item: ListgoogleRowModel
    ) {
    }
  }

  inner class RowListgoogleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgoogleBinding = RowListgoogleBinding.bind(itemView)
  }
}
