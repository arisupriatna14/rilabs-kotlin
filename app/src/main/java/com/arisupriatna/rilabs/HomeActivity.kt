package com.arisupriatna.rilabs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

    var buttonGoBack = findViewById<Button>(R.id.button_back)

    buttonGoBack.setOnClickListener {
      val intentButtonBack = Intent(this@HomeActivity, MainActivity::class.java)
      startActivity(intentButtonBack)
    }
  }
}
