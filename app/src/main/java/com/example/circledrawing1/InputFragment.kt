package com.example.circledrawing1

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.circledrawing1.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    var listener: FragmentCommunicationListener? = null
    var radius: Float? = null

    lateinit var binding: FragmentInputBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)

        try {
            listener = context as FragmentCommunicationListener
            println("successful")
        }catch (e: Exception){
            println("unsuccessful")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInputBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.btnShowCircle.setOnClickListener {

            listener?.radiusEntered(binding.etRadius.text.toString().toFloat())




        }
    }

    interface FragmentCommunicationListener {

        fun radiusEntered(radius: Float)

    }
}


