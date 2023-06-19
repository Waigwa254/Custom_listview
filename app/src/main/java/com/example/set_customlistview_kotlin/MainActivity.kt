package com.example.set_customlistview_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.set_customlistview_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding :ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId= intArrayOf(
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
            R.drawable.h,R.drawable.i,R.drawable.lambo,R.drawable.ferrarri,R.drawable.bughati
        )

        val name = arrayOf(
            "Augustine",
            "Jane",
            "James"	,
            "Robert	",
            "John"	,
            "Michael"	,
            "David"	,
            "William",
            "Richard",
            "Joseph",
            "Thomas"	,
            "Christopher"

        )
        val lastMessage= arrayOf(
            "in a meeting",
            "in a meeting",
             "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting",
            "in a meeting"
        )
        val lastmsgTime= arrayOf(
            "5:20","5:20","5:20","5:20","5:20","5:20","5:20","5:20","5:20","5:20","5:20","5:20",
        )
        val phoneNo= arrayOf(
           " 0703223573"," 0703223573"," 0703223573"," 0703223573"," 0703223573",
            " 0703223573"," 0703223573"," 0703223573"," 0703223573"," 0703223573",
            " 0703223573"," 0703223573"
        )
        val country = arrayOf(
            "Kenya","uk", "Kenya","uk", "Kenya","uk", "Kenya","uk", "Kenya","uk", "Kenya","uk"
        )

        userArrayList=ArrayList()
        for (i in name. indices){

            val user =User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(user)
    }
        binding.listview.isClickable=true
        binding.listview.adapter=MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id->

            val name =name[position]
            val phone =phoneNo[position]
            val country =country[position]
            val imageId= imageId[position]

            val i= Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }
}
}