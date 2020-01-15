package com.example.wifiqui.ui.Videos

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.wifiqui.R

class VideosFragment : Fragment() {


    private lateinit var videosViewModel: VideosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_videos, container, false)
        val textView: TextView = root.findViewById(R.id.text_videos)
        val Video: VideoView = root.findViewById(R.id.videoView)

        Video.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4")
        Video.requestFocus()
        Video.start()


        textView.text = "Videos"
        return root
    }
}



