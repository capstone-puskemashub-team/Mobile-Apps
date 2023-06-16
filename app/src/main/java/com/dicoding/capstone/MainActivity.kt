package com.dicoding.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.dicoding.capstone.ui.login.LoginActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnNext = findViewById(R.id.btn_next)

        btnNext.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_next -> {
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            }
        }
    }


}
