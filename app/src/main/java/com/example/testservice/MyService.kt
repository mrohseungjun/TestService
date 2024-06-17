package com.example.testservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    private var count = 0

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e("Service", "Service is started")
        Thread {
            while (true) {
                Log.d("Service", "Service is running")
                Log.d("Service", "${count++}")
                try {
                    Thread.sleep(1000)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }.start()

        return START_STICKY
    }

    override fun onDestroy() {
        Log.e("Service", "Service is destroyed")
        count = 0
        super.onDestroy()
    }
}