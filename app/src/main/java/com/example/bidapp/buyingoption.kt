package com.example.bidapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction


class buyingoption : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v= inflater.inflate(R.layout.fragment_buyingoption, container, false)
      val  switch2=v.findViewById<TextView>(R.id.switch2)
        switch2.setOnClickListener{
            val sellingoptionoption=Sellingoption()
            val transaction: FragmentTransaction =parentFragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainlayout,sellingoptionoption).commit()




        }

        return v
    }

}