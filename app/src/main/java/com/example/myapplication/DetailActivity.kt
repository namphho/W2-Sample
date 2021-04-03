package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val textView = findViewById<TextView>(R.id.textView2)

        val bundle = intent.extras
        bundle?.let {
            val student = bundle.getParcelable<Student>("student")
            textView.text = String.format("%s - %s - %s", student?.lastName, student?.firstName, student?.email)
        }

    }
}