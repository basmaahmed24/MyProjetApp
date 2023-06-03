package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val pay:Button=findViewById(R.id.pay)
        var total_txt:TextView=findViewById(R.id.total);
        val int_pay = intent
        val name_ = int_pay.getStringExtra("name")
        total_txt.text =name_
        pay.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }



    }

}