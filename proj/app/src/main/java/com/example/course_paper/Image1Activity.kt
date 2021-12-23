package com.example.course_paper

import android.app.WallpaperManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Image1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image1)
    }

    fun onClickSetImage1(view: View){
        val bitmap : Bitmap =
            BitmapFactory.decodeResource(resources, R.drawable.image1)
        val wallpaperManager = WallpaperManager.getInstance(baseContext)
        wallpaperManager.setBitmap(bitmap)
        Toast.makeText(this, "Wallpaper set!", Toast.LENGTH_SHORT).show()
    }
}