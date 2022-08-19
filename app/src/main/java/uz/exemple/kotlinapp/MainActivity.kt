package uz.exemple.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        val btnToSecond =  findViewById<Button>(R.id.btnToSecondActivity)
        btnToSecond.setOnClickListener {
            openSecondActivity()
        }
    }

    fun openSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}