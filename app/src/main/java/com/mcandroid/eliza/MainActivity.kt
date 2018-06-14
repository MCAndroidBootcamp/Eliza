package com.mcandroid.eliza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAsk.setOnClickListener{
            var question = findViewById<TextView>(R.id.etQuestion) as TextView
            var response = findViewById<TextView>(R.id.tvElizaSays) as TextView
            var eliza = Eliza()
            eliza.ask(question.text.toString())
            response.text = eliza.generateResponse()

            //CLEAN UP (MOVE TO SEPARATE METHOD)
            //hide keyboard
            //https://stackoverflow.com/questions/1109022/close-hide-the-android-soft-keyboard
            //clear question
            question.setText("")
        }

    }

   }