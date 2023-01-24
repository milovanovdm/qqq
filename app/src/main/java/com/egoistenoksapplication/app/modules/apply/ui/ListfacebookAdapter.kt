package com.egoistenoksapplication.app.modules.apply.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.databinding.RowListfacebook1Binding
import com.egoistenoksapplication.app.modules.apply.`data`.model.Listfacebook1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfacebookAdapter(
  var list: List<Listfacebook1RowModel>
) : RecyclerView.Adapter<ListfacebookAdapter.RowListfacebook1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfacebook1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfacebook1,parent,false)
    return RowListfacebook1VH(view)
  }

  override fun onBindViewHolder(holder: RowListfacebook1VH, position: Int) {
    val listfacebook1RowModel = Listfacebook1RowModel()
    // TODO uncomment following line after integration with data source
    // val listfacebook1RowModel = list[position]
    holder.binding.listfacebook1RowModel = listfacebook1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfacebook1RowModel>) {
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
      item: Listfacebook1RowModel
    ) {
    }
  }

  inner class RowListfacebook1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfacebook1Binding = RowListfacebook1Binding.bind(itemView)
  }
}
