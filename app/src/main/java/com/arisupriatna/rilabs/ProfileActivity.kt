package com.arisupriatna.rilabs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_profile)

    var buttonFollow = findViewById<Button>(R.id.btn_follow)
    buttonFollow.setOnClickListener {
      var intentBtnFollow = Intent(this@ProfileActivity, MainActivity::class.java)
      startActivity(intentBtnFollow)
    }
  }

}
