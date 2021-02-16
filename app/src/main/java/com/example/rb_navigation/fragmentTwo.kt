package com.example.rb_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation


class FragmentTwo : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)

        val textView = view.findViewById<TextView>(R.id.text_view_2)

        textView.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }

        return view
    }

}