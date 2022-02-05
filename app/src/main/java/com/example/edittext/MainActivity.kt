package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text:TextView =findViewById<TextView>(R.id.textView)
        var text2:TextView = findViewById<TextView>(R.id.textView2)
        var userName:EditText = findViewById<EditText>(R.id.editTextTextPersonName)
        var pass:EditText = findViewById<EditText>(R.id.editTextTextPassword)
        var button:Button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            text.setText(userName.text)
            text2.setText(pass.text)
        }

    }
}