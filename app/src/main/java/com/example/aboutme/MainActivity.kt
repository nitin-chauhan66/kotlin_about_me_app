package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(it: View) {
        binding.apply {
            nicknameTextView.text = nicknameEditText.text
            nicknameEditText.visibility = View.GONE
            it.visibility = View.GONE
            nicknameTextView.visibility = View.VISIBLE
        }
        /*
        Hide the keyboard.
        TODO("yet to be implemented")
        */
    }
}