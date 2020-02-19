package com.example.wifiqui.ui.Apuntes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wifiqui.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
    private lateinit var database: DatabaseReference// ...

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_gallery, container, false)


        database = FirebaseDatabase.getInstance().reference

        // leer o escribir datos


        return root
    }
}