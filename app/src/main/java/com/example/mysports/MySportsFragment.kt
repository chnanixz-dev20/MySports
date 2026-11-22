package com.example.mysports

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MySportsFragment : Fragment(R.layout.fragment_my_sports) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Each button follows an action defined in the navigation graph
        view.findViewById<Button>(R.id.football_button).setOnClickListener {
            findNavController().navigate(R.id.action_mySports_to_football)
        }
        view.findViewById<Button>(R.id.basketball_button).setOnClickListener {
            findNavController().navigate(R.id.action_mySports_to_basketball)
        }
        view.findViewById<Button>(R.id.tennis_button).setOnClickListener {
            findNavController().navigate(R.id.action_mySports_to_tennis)
        }
    }
}