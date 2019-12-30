package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToMeaning(v: View) {
        val word = (v as Button).text
        val intent = Intent(this@MainActivity, MeaningActivity::class.java)
        intent.putExtra(MeaningActivity.KEY_WORD, word)
        startActivity(intent)
    }
}
