package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var LOG_TAG = "MYLOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "Белая береза")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "Под моим окном")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "Точно серебром.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "Принакрылась снегом,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "Точно серебром.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "На пушистых ветках")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "Распустились кисти")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "Снежною каймой")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_TAG, "Принакрылась снегом,")
    }


}