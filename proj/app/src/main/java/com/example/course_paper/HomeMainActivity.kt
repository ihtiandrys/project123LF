package com.example.course_paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.system.exitProcess

class HomeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)
    }

    // Слушатель событий нажатий на кнопку "Изображения"
    fun onClickGoWallpaper(view: View){
        val intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "Тест Recycler View"
    fun onClickGoRecyclerView(view: View){
        val intent = Intent(this, WallpaperActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "Живые изображения"
    fun onClickGoLiveWallpaper(view: View){
        val intent = Intent(this, LiveWallpaperActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "Тестовые приложения"
    fun onClickGoTest(view: View){
        val intent = Intent(this, TestAppActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "О программе"
    fun onClickGoHelp(view: View){
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "Выйти"
    fun onClickGoExit(view: View){
        this.finishAffinity()
    }
}