package com.example.wifiqui.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.wifiqui.R
import com.example.wifiqui.ui.Videos.VideosFragment
import com.example.wifiqui.ui.gallery.GalleryFragment
import com.example.wifiqui.ui.send.SendFragment
import com.example.wifiqui.ui.share.ShareFragment
import com.example.wifiqui.ui.slideshow.SlideshowFragment
import com.example.wifiqui.ui.tools.ToolsFragment
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val imageButton5: ImageButton = root.findViewById(R.id.imageButton5)
        val imageButton6: ImageButton = root.findViewById(R.id.imageButton6)
        val imageButton7: ImageButton = root.findViewById(R.id.imageButton7)
        val imageButton9: ImageButton = root.findViewById(R.id.imageButton9)
        val imageButton10: ImageButton = root.findViewById(R.id.imageButton10)
        val imageButton11: ImageButton = root.findViewById(R.id.imageButton11)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        imageButton5.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.nav_host_fragment, GalleryFragment())
            fr?.commit()
        }

        imageButton6.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.nav_host_fragment, ShareFragment())
            fr?.commit()
        }
        imageButton7.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.nav_host_fragment, SendFragment())
            fr?.commit()
        }

        imageButton9.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.nav_host_fragment, VideosFragment())
            fr?.commit()
        }
        imageButton10.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.nav_host_fragment, SlideshowFragment())
            fr?.commit()
        }
        imageButton11.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.nav_host_fragment, ToolsFragment())
            fr?.commit()
        }
    }
}