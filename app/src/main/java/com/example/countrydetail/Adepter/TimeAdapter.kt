package com.example.countrydetail.Adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.countrydetail.R

class TimeAdapter(timezones: List<String?>?) : RecyclerView.Adapter<TimeAdapter.TimeHolder>() {

    var time=timezones
    lateinit var context:Context
    class TimeHolder(itemView: View): ViewHolder(itemView) {

        var txttime=itemView.findViewById<TextView>(R.id.txttime)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeHolder {
        context=parent.context
        return TimeHolder(LayoutInflater.from(parent.context).inflate(R.layout.time_item,parent,false))
    }

    override fun getItemCount(): Int {
      return time?.size!!
    }

    override fun onBindViewHolder(holder: TimeHolder, position: Int) {
     holder.apply {
         txttime.setText(time?.get(position))
     }
    }
}