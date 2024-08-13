package com.example.demoactivity

import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uri = ContractNotes.CONTENT_URI
        val cursor = contentResolver.query(uri,null,null,null,null)
        println(cursor?.moveToNext())
        println(cursor?.count)
        cursor?.close()
    }
}