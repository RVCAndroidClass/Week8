package edu.rvc.student.week8

//needed Imports
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //bind objects
        val btngo = findViewById<Button>(R.id.btnPage2)
        val txtsend = findViewById<EditText>(R.id.txtSend)

        btngo.setOnClickListener(View.OnClickListener {
            //Intent is used to send data between activities
            val intent = Intent(this, Main2Activity::class.java)
            //putExtra sets value to name SendStuff
            intent.putExtra("SendStuff",txtsend.text.toString())
            //Go to second activity
            startActivity(intent)

        })

    }
}
