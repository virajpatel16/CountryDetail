package com.example.countrydetail.Adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.countrydetail.R

class PhoneCodeAdapter(callingCodes: List<String?>?) :
    RecyclerView.Adapter<PhoneCodeAdapter.Phonecodeholder>() {
    var phone=callingCodes
    var plus="+"
    lateinit var context:Context
    class Phonecodeholder(itemView: View): ViewHolder(itemView) {

        var phone=itemView.findViewById<TextView>(R.id.txtphonecode)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Phonecodeholder {
        context=parent.context
        return Phonecodeholder(LayoutInflater.from(parent.context).inflate(R.layout.phone_code_item,parent,false))
    }

    override fun getItemCount(): Int {
    return phone?.size!!
    }

    override fun onBindViewHolder(holder: Phonecodeholder, position: Int) {
       holder.phone.setText(plus+phone?.get(position))
    }
}