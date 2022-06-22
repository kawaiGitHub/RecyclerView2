package com.example.app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter :RecyclerView.Adapter<ViewHolderItem>() {

     val nameList = listOf("My name0","My name1","My name2","My name3","My name4","My name5")
    private val messageList = listOf("メッセージ0","メッセージ1","メッセージ2","メッセージ3","メッセージ4","メッセージ5")
    private val imgList = listOf(
        R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout,parent,false)
        return ViewHolderItem(itemXml)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.tvNameHolder.text = nameList[position]
        holder.tvMessageHolder.text = messageList[position]
        holder.ivHolder.setImageResource(imgList[position])
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}