package com.app.headerviewlistdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_header_layout.view.*
import kotlinx.android.synthetic.main.item_layout.view.*

class MyAdapter(private val myDataset: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    class MyViewHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        if (viewType == 0) {
            val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_header_layout, parent, false)
            // set the view's size, margins, paddings and layout parameters
            return MyViewHeaderHolder(textView)
        } else {
            val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
            // set the view's size, margins, paddings and layout parameters
            return MyViewHolder(textView)
        }
        // create a new view

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.itemView.txtTitle.text = myDataset[position]
        } else {
            holder.itemView.txtHeader.text=myDataset[position]
            //holder.textView.text = myDataset[position]
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size

    override fun getItemViewType(position: Int): Int {
        if(myDataset[position].equals("h")){
            return  0
        }else{
            return  1
        }
    }
}