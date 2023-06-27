package com.example.countrydetail.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.countrydetail.Adepter.CurrencyAdapter
import com.example.countrydetail.Adepter.LanguageAdapter
import com.example.countrydetail.Adepter.PhoneCodeAdapter
import com.example.countrydetail.Adepter.TimeAdapter
import com.example.countrydetail.MainActivity
import com.example.countrydetail.databinding.ActivityCountrydetailBinding

class Countrydetail : AppCompatActivity() {
    lateinit var binding:ActivityCountrydetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCountrydetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pos=intent.getIntExtra("pos",0)

        var data = MainActivity.data

        if (pos !=null){
            binding.countryname.setText(data.get(pos).name)
            Glide.with(this).load(data.get(pos).flags?.png).into(binding.countryflag)
            Glide.with(this).load(data.get(pos).flags?.png).into(binding.bigFlag)
            binding.alphacode.setText(data.get(pos).alpha3Code)
            binding.capital.setText(data.get(pos).capital)
            binding.Capital.setText(data.get(pos).capital)
            binding.regine.setText(data.get(pos).region)
            binding.area.setText(data.get(pos).area!!.toString())
            binding.population.setText(data.get(pos).population!!)


            binding.rcvLanguage.layoutManager=GridLayoutManager(this,3)
            binding.rcvLanguage.adapter=LanguageAdapter(data.get(pos).languages)

            binding.rcvCurrency.layoutManager=LinearLayoutManager(this)
            binding.rcvCurrency.adapter=CurrencyAdapter(data.get(pos).currencies)

            binding.rcvPhoneCode.layoutManager=LinearLayoutManager(this)
            binding.rcvPhoneCode.adapter=PhoneCodeAdapter(data.get(pos).callingCodes)


            binding.rcvtime.layoutManager=LinearLayoutManager(this)
            binding.rcvtime.adapter=TimeAdapter(data.get(pos).timezones)




        }
    }
}