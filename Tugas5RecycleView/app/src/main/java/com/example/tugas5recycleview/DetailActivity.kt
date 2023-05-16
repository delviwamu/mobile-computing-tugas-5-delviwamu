package com.example.tugas5recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val wisata = intent.getParcelableExtra<Image>("wisata")
        if (wisata != null) {
            val imageView: ImageView = findViewById(R.id._image)
            val textViewTitle: TextView = findViewById(R.id._imageTitle)
            val textViewDesc: TextView = findViewById(R.id._imageDesc)

            imageView.setImageResource(wisata.imageSource)
            textViewTitle.text = wisata.imageTitle
            textViewDesc.text = wisata.imageDesc
        }
    }
}