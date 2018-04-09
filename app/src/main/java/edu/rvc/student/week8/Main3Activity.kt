package edu.rvc.student.week8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val txtshow = findViewById<TextView>(R.id.txtShow)
        val btnBack = findViewById<Button>(R.id.btnBack)
        //loads intent string from MainActivity.kt

        var strShow: String = intent.getStringExtra("SendStuff")
        txtshow.text = strShow

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish()
        })
    }
}
