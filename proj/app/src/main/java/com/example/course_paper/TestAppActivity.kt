package com.example.course_paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_app)
    }

    // Слшуатель событий нажатий на кнопку "Теорема Пифагора"
    fun onClickGoPT(view: View){
        val intent = Intent(this, PythagoreanTheoremeActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "Зарплата"
    fun onClickGoZP(view:View){
        val intent = Intent(this, ZPActivity::class.java)
        startActivity(intent)
    }

    // Слушатель событий нажатий на кнопку "Gif изображение"
    fun onClickGoGif(view: View){
        val intent = Intent(this, GifActivity::class.java)
        startActivity(intent)
    }
}