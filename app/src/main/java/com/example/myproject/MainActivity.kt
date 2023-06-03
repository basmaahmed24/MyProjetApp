package com.example.myproject

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.TextView



val authority = "com.example.myproject"
val uri = Uri.parse("content://$authority/cakes")




val cakes = listOf(
    "Chocolate Cake",
    "Vanilla Cake",
    "Red Velvet Cake",
    "Blueberry Cake"
)





    class MainActivity : AppCompatActivity() {
        @SuppressLint("WrongViewCast", "MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)



            val chocobtn: Button = findViewById(R.id.chocobtn);
            val vanbtn: Button = findViewById(R.id.vanillabtn);
            val redbtn: Button = findViewById(R.id.redbtn);
            val bluebtn: Button = findViewById(R.id.bluebtn);
            val choc_txt :TextView = findViewById(R.id.chocotxt)
            val van_txt : TextView = findViewById(R.id.vantxt)
            val red_txt : TextView = findViewById(R.id.redtxt)
            val blue_txt: TextView = findViewById(R.id.bluetxt)

            val check: Button = findViewById(R.id.checkout);
            var counter: Int = 0;
            var counter2: Int=0
            var counter3: Int= 0
            var counter4:Int=0

            var sum1: Int = 0
            var sum2: Int = 0
            var sum3: Int = 0
            var sum4: Int = 0
            var total:Int=0



            check.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                total = sum1+sum2+sum3+sum4
             intent.putExtra("name",total.toString())
             startActivity(intent)

            }
            chocobtn.setOnClickListener{
                counter++
                sum1=counter*20
                choc_txt.text=counter.toString();

            }

            vanbtn.setOnClickListener {
                counter2++
                sum2 = counter2 *15;
                van_txt.text=counter2.toString();

            }

            redbtn.setOnClickListener {
                counter3++
                sum3=counter3*25
                red_txt.text=counter3.toString()

            }

            bluebtn.setOnClickListener {
                counter4++
                sum4=counter4*30
                blue_txt.text=counter4.toString()

            }

           // val location = "Amman"
            //val mapUri = Uri.parse("geo:0,0?q=$location")
            //val mapIntent = Intent(Intent.ACTION_VIEW, mapUri)
            //mapIntent.setPackage("com.google.android.apps.maps")
            //startActivity(mapIntent)

            //val alarmIntent = Intent(AlarmClock.ACTION_SET_ALARM)
           // alarmIntent.putExtra(AlarmClock.EXTRA_HOUR, 9)
           // alarmIntent.putExtra(AlarmClock.EXTRA_MINUTES, 30)
           // alarmIntent.putExtra(AlarmClock.EXTRA_MESSAGE, "your Order has Arrived!")
            //startActivity(alarmIntent)





        }


    }

