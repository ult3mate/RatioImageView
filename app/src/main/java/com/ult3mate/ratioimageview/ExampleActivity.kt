package com.ult3mate.ratioimageview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatImageView
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_example.*

class ExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        //
        loadImage(sample_1 , sample_2 , sample_3)

    }

    private fun loadImage(vararg imageView: AppCompatImageView){
        imageView.forEach {
            Glide.with(this)
                    .load("https://www.calliaweb.co.uk/wp-content/uploads/2015/10/600x400.jpg")
                    .into(it)
        }
    }
}
