package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

open class BaseActivity : AppCompatActivity() {

    override fun setContentView(view: View?) {
        super.setContentView(view)
        le()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        le()
    }

    override fun onStart() {
        super.onStart()
        le()
    }

    override fun onResume() {
        super.onResume()
        le()
    }

    override fun onPause() {
        super.onPause()
        le()
    }

    override fun onStop() {
        super.onStop()
        le()
    }

    override fun onDestroy() {
        super.onDestroy()
        le()
    }

    override fun onRestart() {
        super.onRestart()
        le()
    }

    fun le() {
        val clazz = this.javaClass.simpleName
        val stackTraceElement = Throwable().stackTrace[1]
        val method = stackTraceElement.methodName
        val line = stackTraceElement.lineNumber
        Log.e(clazz, "$method")
    }
}