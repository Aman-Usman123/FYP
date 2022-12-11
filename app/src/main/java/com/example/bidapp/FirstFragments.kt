package com.example.bidapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FirstFragments : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v=  inflater.inflate(R.layout.fragment_first_fragments, container, false)
        val bt=v.findViewById<Button>(R.id.register1)
        val log=v.findViewById<Button>(R.id.login)
bt.setOnClickListener {
val secoundFragments=SecoundFragments()
    val transaction:FragmentTransaction=parentFragmentManager!!.beginTransaction()
transaction.replace(R.id.mainlayout,secoundFragments).commit()



}
        log.setOnClickListener {
            val sellingoption=Sellingoption()
            val transaction:FragmentTransaction=parentFragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainlayout,sellingoption).commit()
        }
return v


}}