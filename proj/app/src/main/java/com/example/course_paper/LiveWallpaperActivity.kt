package com.example.course_paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class LiveWallpaperActivity : AppCompatActivity() {
   private  lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_wallpaper)

        image = findViewById(R.id.ivAnimation)

        animateRocket()
    }

    private fun animateRocket(){
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)

        image.animation = rotate
    }
}