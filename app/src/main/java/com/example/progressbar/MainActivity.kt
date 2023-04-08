package com.example.progressbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            progress_bar.visibility = View.GONE
             val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }, 2000)





    }
}
