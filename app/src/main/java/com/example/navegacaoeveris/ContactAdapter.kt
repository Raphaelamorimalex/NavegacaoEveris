package com.example.navegacaoeveris

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {
    private val list: MutableList<Contact> = mutableListOf()

    class ContactAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val tvname: TextView = itemView.findViewById(R.id.tv_name)
        private val tvtelephone: TextView = itemView.findViewById(R.id.tv_telephone)
        private val tvphoto: ImageView = itemView.findViewById(R.id.tv_photo)
        fun bind(contact: Contact){
            tvname.text = contact.name
            tvtelephone.text = contact.telephone


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
        return ContactAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
    fun upDateList(list: List<Contact>){
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()

    }
}