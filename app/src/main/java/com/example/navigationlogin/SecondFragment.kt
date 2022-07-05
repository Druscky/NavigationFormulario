package com.example.navigationlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationlogin.databinding.FragmentInitBinding
import com.example.navigationlogin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _b: FragmentSecondBinding? = null
    private val b get() = _b!!
    private val args: SecondFragmentArgs by navArgs()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnVolver.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_initFragment)

        }

        val email = args.correo
        b.tvCorreoSecond.text = "\t\t Email: " + email

        val phone = args.phone
        b.tvPhoneSecond.text = "\t\t Telefono: " + phone

       val name = args.nombre
        b.tvNombreSecond.text = "\t\t Nombre: " + name


    }
}