package com.example.course_paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
    }

    fun onClickGoImage0(view: View){
        val intent = Intent(this, Image0Activity::class.java)
        startActivity(intent)
    }

    fun onClickGoImage1(view: View){
        val intent = Intent(this, Image1Activity::class.java)
        startActivity(intent)
    }

    fun onClickGoImage2(view: View){
        val intent = Intent(this, Image2Activity::class.java)
        startActivity(intent)
    }

    fun onClickGoImage3(view: View){
        val intent = Intent(this, Image3Activity::class.java)
        startActivity(intent)
    }

    fun onClickGoImage4(view: View){
        val intent = Intent(this, Image4Activity::class.java)
        startActivity(intent)
    }

    fun onClickGoImage5(view: View){
        val intent = Intent(this, Image5Activity::class.java)
        startActivity(intent)
    }
}