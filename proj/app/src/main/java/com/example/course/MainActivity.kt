package com.example.course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Класс android.os.Handler является дальнейшим развитием потоков, упрощающий код.
import android.os.Handler



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Handler может использоваться для планирования выполнения кода в некоторый момент в будущем.
         */
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, HomeMainActivity::class.java)
            startActivity(intent)
        }, 1000)
    }
}