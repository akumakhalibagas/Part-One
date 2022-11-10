package com.makhalibagas.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.bt_active).setOnClickListener {
            val show = DataShow()
            Toast.makeText(this, show.getData(), Toast.LENGTH_SHORT).show()
            findViewById<AppCompatTextView>(R.id.tv_data).text = show.getData()
        }
    }

}

class DataShow : OnDataShow {
    override fun getData(): String {
        return "Halooo"
    }
}