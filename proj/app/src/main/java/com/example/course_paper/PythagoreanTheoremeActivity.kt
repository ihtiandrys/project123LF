package com.example.course_paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.course_paper.databinding.ActivityPythagoreanTheoremeBinding
import kotlin.math.pow
import kotlin.math.sqrt

class PythagoreanTheoremeActivity : AppCompatActivity() {
    lateinit var binding: ActivityPythagoreanTheoremeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPythagoreanTheoremeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGoResult(view: View){
        if(!isFieldEmpty()){
            val result1 = "Результат:" + getResult()
            binding.tvResult.text = result1
        }
    }

    private fun isFieldEmpty(): Boolean{
        binding.apply {
            if(edA.text.isNullOrEmpty()) edA.error = "Поле должно быть заполнено"
            if(edB.text.isNullOrEmpty()) edB.error = "Поле должно быть заполнено"
            return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()
        }
    }

    private fun getResult(): String{
        val a:Double
        val b:Double

        binding.apply {
            a = edA.text.toString().toDouble()
            b = edB.text.toString().toDouble()
        }
        return sqrt( (a.pow(2) + b.pow(2)) ).toString()
    }
}