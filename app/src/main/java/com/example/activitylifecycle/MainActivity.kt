package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Timer().schedule(3000){ //执行的任务
//            val intent = Intent(this@MainActivity, NewActivity::class.java)
//            startActivity(intent)
//        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, NewActivity::class.java)
            startActivity(intent)
        }
    }
}