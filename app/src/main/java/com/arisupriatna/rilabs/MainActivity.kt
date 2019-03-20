package com.arisupriatna.rilabs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showTextView = findViewById<TextView>(R.id.show_text_view)
        var inputText = findViewById<EditText>(R.id.input_text)
        var buttonShow = findViewById<Button>(R.id.show_button)
        var buttonGoHome = findViewById<Button>(R.id.button_go_home)

        buttonShow.setOnClickListener {
            var text = inputText.text.toString()
            if (text.trim().isNotEmpty()) {
                showTextView.text = text
            } else {
                Toast.makeText(applicationContext, "Please enter some message!", Toast.LENGTH_SHORT).show()
            }

        }

        buttonGoHome.setOnClickListener {
            var intent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intent) // for navigate to another screen
        }
    }
}
