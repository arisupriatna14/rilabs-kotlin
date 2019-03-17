package com.arisupriatna.rilabs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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
            showTextView.text = text
        }

        buttonGoHome.setOnClickListener {
            var intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent) // for navigate to another screen
        }
    }
}
