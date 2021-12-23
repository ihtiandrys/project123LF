package com.example.course_paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.course_paper.constance.Constance
import com.example.course_paper.databinding.ActivityZpactivityBinding

class ZPActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityZpactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityZpactivityBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btZP321.setOnClickListener {
            val resultValue = bindingClass.edName.text.toString()

            when (resultValue) {
                Constance.INGINER -> {
                    bindingClass.tvResult321.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.INGENER_ZP} руб."
                    bindingClass.tvResult321.text =
                        if (bindingClass.edPass.text.toString() == Constance.INGINER_PASSWORD) {
                            tempText
                        } else {
                            "Неверный пароль"
                        }
                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult321.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DVORNIK_ZP} руб."
                    bindingClass.tvResult321.text =
                        if (bindingClass.edPass.text.toString() == Constance.DVORNIK_PASSWORD) {
                            tempText
                        } else {
                            "Неверный пароль"
                        }
                }

                Constance.DIRECTOR -> {
                    bindingClass.tvResult321.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_ZP} руб."
                    bindingClass.tvResult321.text =
                        if (bindingClass.edPass.text.toString() == Constance.DIRECTOR_PASSWORD) {
                            tempText
                        } else {
                            "Неверный пароль"
                        }
                }

                else -> {
                    bindingClass.tvResult321.visibility = View.VISIBLE
                    bindingClass.tvResult321.text = "Нет такого работника."
                }
            }
        }
    }
}