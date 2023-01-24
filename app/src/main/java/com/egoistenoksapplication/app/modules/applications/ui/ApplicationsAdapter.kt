package com.egoistenoksapplication.app.modules.applications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.egoistenoksapplication.app.R
import com.egoistenoksapplication.app.databinding.RowApplicationsBinding
import com.egoistenoksapplication.app.modules.applications.`data`.model.ApplicationsRowModel
import kotlin.Int
import kotlin.collections.List

class ApplicationsAdapter(
  var list: List<ApplicationsRowModel>
) : RecyclerView.Adapter<ApplicationsAdapter.RowApplicationsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowApplicationsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_applications,parent,false)
    return RowApplicationsVH(view)
  }

  override fun onBindViewHolder(holder: RowApplicationsVH, position: Int) {
    val applicationsRowModel = ApplicationsRowModel()
    // TODO uncomment following line after integration with data source
    // val applicationsRowModel = list[position]
    holder.binding.applicationsRowModel = applicationsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ApplicationsRowModel>) {
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
      item: ApplicationsRowModel
    ) {
    }
  }

  inner class RowApplicationsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowApplicationsBinding = RowApplicationsBinding.bind(itemView)
    init {
      binding.btn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ApplicationsRowModel())
      }
    }
  }
}
