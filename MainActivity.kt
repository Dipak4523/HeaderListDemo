package com.app.headerviewlistdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(getList())
        recyclerView.setLayoutManager(linearLayoutManager)
        recyclerView.setAdapter(adapter)
    }

    private fun getList():ArrayList<String>{
        val array=ArrayList<String>()
        array.add("h")
        array.add("sdsd")
        array.add("sdsddsd")
        array.add("sdsdasdsadsd")
        array.add("h")
        array.add("dasdh")
        array.add("sdsdh")
        return array
    }
}
