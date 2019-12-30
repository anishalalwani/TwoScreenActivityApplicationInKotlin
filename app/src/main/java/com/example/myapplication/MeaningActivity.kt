package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_meaning.*

class MeaningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meaning)
        title = getString(R.string.word)

        val word = intent.getStringExtra(KEY_WORD)
        title = word

        meaning.text = when(word) {
            getString(R.string.word) ->
                getString(R.string.meaning)
            getString(R.string.word1) ->
                getString(R.string.meaning1)
            else -> getString(R.string.unknown_word)
        }
    }

    companion object {
        const val KEY_WORD = "word"
    }
}
