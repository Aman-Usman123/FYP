@file:Suppress("UNREACHABLE_CODE")

package com.example.bidapp

import android.os.Bundle
import android.os.Handler
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.example.bidapp.databinding.FragmentSecoundFragmentsBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class SecoundFragments : Fragment() {
    private lateinit var binding:FragmentSecoundFragmentsBinding
    private lateinit var database:DatabaseReference
    private var progressBar: ProgressBar? = null
    private var i = 0
    private var txtView: TextView? = null
    private val handler = Handler()
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       inflater.inflate(R.layout.fragment_secound_fragments, container, false)

        binding=FragmentSecoundFragmentsBinding.inflate(inflater, container, false)

        binding.reg.setOnClickListener{

            val Email=binding.etEmail.text.toString()
            val Password=binding.etPassword.text.toString()
            val address=binding.etAddress.text.toString()
            val Zipcode=binding.zipcode.text.toString()
            if(TextUtils.isEmpty(Email)||   (TextUtils.isEmpty(Password)) ||  (TextUtils.isEmpty(address)) || (TextUtils.isEmpty(Zipcode))) {
                Toast.makeText(requireActivity(),"succesfully Register",Toast.LENGTH_SHORT).show()

            }

            else{


                database=FirebaseDatabase.getInstance().getReference("User")
                val User=user(Email,Password,address,Zipcode)
                database.child(Email).setValue(User).addOnSuccessListener {

                    binding.etEmail.text.clear()
                    binding.etPassword.text.clear()
                    binding.etAddress.text.clear()
                    binding.zipcode.text.clear()

                    Toast.makeText(requireActivity(),"saved", Toast.LENGTH_SHORT).show()

                }.addOnFailureListener{


                    Toast.makeText(requireActivity(),"Not saved", Toast.LENGTH_SHORT).show()

                }
            }
        }

return binding.root

        }





    }


