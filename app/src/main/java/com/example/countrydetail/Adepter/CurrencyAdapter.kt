package com.example.countrydetail.Adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.countrydetail.Model.CurrenciesItem
import com.example.countrydetail.R
import org.w3c.dom.Text

class CurrencyAdapter(currencies: List<CurrenciesItem?>?) : RecyclerView.Adapter<CurrencyAdapter.Currencyholder>() {


    var list=currencies
lateinit var context:Context
    class Currencyholder(itemView: View): ViewHolder(itemView) {

        var txtcurrency=itemView.findViewById<TextView>(R.id.txtcurrency)
        var tvCurrencySymbol=itemView.findViewById<TextView>(R.id.txtCurrencySymbol)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Currencyholder {
context=parent.context

        return Currencyholder(LayoutInflater.from(parent.context).inflate(R.layout.currency_item,parent,false))
    }

    override fun getItemCount(): Int {
       return list?.size!!
    }

    override fun onBindViewHolder(holder: Currencyholder, position: Int) {
        holder.txtcurrency.setText(list?.get(position)?.name.toString())
        holder.tvCurrencySymbol.setText(list?.get(position)?.symbol.toString())
    }
}