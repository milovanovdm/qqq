package com.egoistenoksapplication.app.modules.apply.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.databinding.RowListgoogle1Binding
import com.egoistenoksapplication.app.modules.apply.`data`.model.Listgoogle1RowModel
import kotlin.Int
import kotlin.collections.List

class ListgoogleAdapter(
  var list: List<Listgoogle1RowModel>
) : RecyclerView.Adapter<ListgoogleAdapter.RowListgoogle1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgoogle1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgoogle1,parent,false)
    return RowListgoogle1VH(view)
  }

  override fun onBindViewHolder(holder: RowListgoogle1VH, position: Int) {
    val listgoogle1RowModel = Listgoogle1RowModel()
    // TODO uncomment following line after integration with data source
    // val listgoogle1RowModel = list[position]
    holder.binding.listgoogle1RowModel = listgoogle1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgoogle1RowModel>) {
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
      item: Listgoogle1RowModel
    ) {
    }
  }

  inner class RowListgoogle1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgoogle1Binding = RowListgoogle1Binding.bind(itemView)
  }
}
