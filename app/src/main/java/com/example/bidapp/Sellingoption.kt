package com.example.bidapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class Sellingoption : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v1= inflater.inflate(R.layout.fragment_sellingoption, container, false)
        val swutc1=v1.findViewById<TextView>(R.id.switch1)
        swutc1.setOnClickListener{
            val Buyingoption=buyingoption()
            val transaction:FragmentTransaction=parentFragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainlayout,Buyingoption).commit()




        }


        return v1
    }

}