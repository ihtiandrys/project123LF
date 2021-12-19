package com.example.course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)
    }

    // Слушатель нажатий на кнопку "Изображения"
    fun onClickGoWallpaper(view: View){
       val intent = Intent(this, WallpaperActivity::class.java)
       startActivity(intent)
    }

    // Слушатель нажатий на кнопку "Живые изображения"
    fun onClickGoLiveWallpaper(view:View){
        val intent = Intent(this, LiveWallpaperActivity::class.java)
        startActivity(intent)
    }
}