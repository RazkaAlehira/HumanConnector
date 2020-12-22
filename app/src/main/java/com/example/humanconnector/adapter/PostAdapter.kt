package com.example.humanconnector.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.humanconnector.R
import com.example.humanconnector.model.PostTypeText
import kotlinx.android.synthetic.main.post_row.view.*

class PostAdapter(private val post: List<PostTypeText>) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.txt_main.text = post[position].text
    }

    override fun getItemCount() = post.size
}