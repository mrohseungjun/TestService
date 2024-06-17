package com.example.testservice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val serviceIntent = Intent(this, MyService::class.java)
        startService(serviceIntent)*/
    }

    override fun onResume() {
        super.onResume()
        Log.d("Test","State_Resume: ${ApplicationLifecycleStatus.state}")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Test","State_Stop: ${ApplicationLifecycleStatus.state}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Test","State_Destroy: ${ApplicationLifecycleStatus.state}")
    }
}