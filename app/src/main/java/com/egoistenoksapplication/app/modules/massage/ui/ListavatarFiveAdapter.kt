package com.egoistenoksapplication.app.modules.massage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.databinding.RowListavatarFiveBinding
import com.egoistenoksapplication.app.modules.massage.`data`.model.ListavatarFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListavatarFiveAdapter(
  var list: List<ListavatarFiveRowModel>
) : RecyclerView.Adapter<ListavatarFiveAdapter.RowListavatarFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavatarFiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavatar_five,parent,false)
    return RowListavatarFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListavatarFiveVH, position: Int) {
    val listavatarFiveRowModel = ListavatarFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listavatarFiveRowModel = list[position]
    holder.binding.listavatarFiveRowModel = listavatarFiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListavatarFiveRowModel>) {
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
      item: ListavatarFiveRowModel
    ) {
    }
  }

  inner class RowListavatarFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavatarFiveBinding = RowListavatarFiveBinding.bind(itemView)
  }
}
