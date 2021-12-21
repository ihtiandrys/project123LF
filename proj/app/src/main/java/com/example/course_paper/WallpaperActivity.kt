package com.example.course_paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.course_paper.databinding.ActivityWallpaperBinding

class WallpaperActivity : AppCompatActivity() {
    lateinit var binding: ActivityWallpaperBinding
    private val adapter = WallpaperAdapter()
    private val wallpaperIdList = listOf(
        R.drawable.image0,
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
    )
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWallpaperBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@WallpaperActivity,6)
            rcView.adapter = adapter

            btAdd.setOnClickListener{
                if(index > 5) index = 0
                val wallpaper1 = Wallpaper(wallpaperIdList[index], "Image $index")
                adapter.addWallpaper(wallpaper1)
                index++
            }
        }
    }
}