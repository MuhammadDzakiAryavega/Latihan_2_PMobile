package com.dzaki_aryavega.latihan_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var passwd: EditText
    lateinit var btn_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.user)
        passwd = findViewById(R.id.passwd)
        btn_login = findViewById(R.id.btnlogin)

        btn_login.setOnClickListener{
            val username = username.text.toString()
            val password = passwd.text.toString()

            if(username == "admin" && password == "12345678"){
                val akbar = Intent(this,MainActivity2::class.java)

                startActivity(akbar)
            }
            else {
                Toast.makeText(this,"Username atau password tidak sesuai", Toast.LENGTH_SHORT).show()
            }

        }






    }
}