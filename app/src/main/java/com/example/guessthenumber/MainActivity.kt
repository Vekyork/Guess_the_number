package com.example.guessthenumber

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var res = 0
    private fun makeToast(str: String?) {
        Toast.makeText(
            this@MainActivity,
            str,
            Toast.LENGTH_SHORT
        )
            .show()
    }

    fun clickFunction(view: View) {
        val userGuessing: Int
        val variable = findViewById<EditText>(R.id.editId)
        userGuessing =
            variable
                .text
                .toString().toInt()
        if (userGuessing < res) {
            makeToast("Предложенное число больше. Попробуйте снова!")
        } else if (userGuessing > res) {
            makeToast("Предложенное число меньше. Попробуйте снова!")
        } else {
            makeToast(
                "Поздравляем! Вы угадали число!"
            )
        }
    }

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val min = 1
        val max = 100
        res = getRandomNumber(min, max)
    }

    companion object {
        fun getRandomNumber(max: Int, min: Int): Int {
            return ((Math.random() * (max - min)) + min).toInt()
        }
    }

    fun click2(view: View) {
        setContentView(R.layout.activity_about)
    }
}
