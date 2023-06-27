package com.example.countrydetail.Adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.countrydetail.Model.LanguagesItem
import com.example.countrydetail.R

class LanguageAdapter(languages: List<LanguagesItem?>?) : RecyclerView.Adapter<LanguageAdapter.LanguageHolder>() {

    var lang=languages
    lateinit var context:Context
    class LanguageHolder(itemView: View): ViewHolder(itemView) {

        var txtlaungue=itemView.findViewById<TextView>(R.id.txtLanguage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageHolder {
        context=parent.context
      return LanguageHolder(LayoutInflater.from(parent.context).inflate(R.layout.language_item,parent,false))
    }

    override fun getItemCount(): Int {
        return lang?.size!!
    }

    override fun onBindViewHolder(holder: LanguageHolder, position: Int) {

        holder.apply {
            txtlaungue.setText(lang?.get(position)?.name.toString())
        }

    }
}