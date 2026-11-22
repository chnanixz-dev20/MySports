package com.example.mysports

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class ScreenFragment : Fragment(R.layout.fragment_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // The title text comes from the navigation graph (we add it in a later step)
        view.findViewById<TextView>(R.id.screen_text).text =
            arguments?.getString("title") ?: ""
    }
}