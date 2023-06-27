package com.example.countrydetail.Adepter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.countrydetail.Activity.Countrydetail
import com.example.countrydetail.Model.Countrymodel
import com.example.countrydetail.R

class CountryAdepter(data: ArrayList<Countrymodel>) :RecyclerView.Adapter<CountryAdepter.Countryholder>() {


    var list = data
    lateinit var context: Context

    class Countryholder(itemView: View) : ViewHolder(itemView) {
        var img = itemView.findViewById<ImageView>(R.id.countryimg)
        var name = itemView.findViewById<TextView>(R.id.countryname)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Countryholder {
        context = parent.context
        return Countryholder(
            LayoutInflater.from(parent.context).inflate(R.layout.first_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: Countryholder, position: Int) {
       holder.name.text=list.get(position).name


        Glide.with(context).load(list.get(position).flags?.png).into(holder.img)


        holder.itemView.setOnClickListener {


            var intent=Intent(context,Countrydetail::class.java)
            intent.putExtra("pos",position)
            context.startActivity(intent)
        }


    }
}