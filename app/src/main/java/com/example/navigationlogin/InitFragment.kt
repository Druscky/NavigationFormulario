package com.example.navigationlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController
import com.example.navigationlogin.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    private var _b: FragmentInitBinding? = null
    private val b get() = _b!!





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentInitBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btEnviar.setOnClickListener {
            var mail = b.tvMail.text.toString()
            var telefono = b.tvPhone.text.toString()
            var nombre2 = b.tvName.text.toString()

            val action = InitFragmentDirections.actionInitFragmentToSecondFragment(nombre2, mail, telefono )
            view.findNavController().navigate(action)






        }
    }
}
