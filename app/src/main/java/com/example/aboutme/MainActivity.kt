package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var doneButton:Button
    private lateinit var editText:EditText
    private lateinit var nickNameText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doneButton = findViewById(R.id.done_button)
        doneButton.setOnClickListener {
             addNickName(it)
        }
        editText = findViewById(R.id.nickname_edit_text)
        nickNameText = findViewById(R.id.nickname_text_view)
    }

    private fun addNickName(it: View) {
        nickNameText.text = editText.text
        editText.visibility = View.GONE
        it.visibility = View.GONE
        nickNameText.visibility = View.VISIBLE

        /*
        Hide the keyboard.
        TODO("yet to be implemented")
        */
    }
}