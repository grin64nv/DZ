package com.example.myproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Буря мглою небо кроет,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, " Вихри снежные крутя;")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "То, как зверь, она завоет,\n То заплачет, как дитя,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "То по кровле обветшалой")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Вдруг соломой зашумит,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Зимний вечер А. С. Пушкин")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "То, как путник запоздалый,\nК нам в окошко застучит.")
    }


}