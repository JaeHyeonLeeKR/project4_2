package com.leejaehyun.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chb1: CheckBox
        chb1 = findViewById(R.id.chb)

        var rb1: RadioButton
        rb1 = findViewById(R.id.radio1)

        var rb2: RadioButton
        rb2 = findViewById(R.id.radio2)

        var rb3: RadioButton
        rb3 = findViewById(R.id.radio3)

        var text1: TextView
        text1 = findViewById(R.id.text1)

        var img: ImageView
        img = findViewById(R.id.img)

        var btn: Button
        btn = findViewById(R.id.button)

        var rg1 : RadioGroup
        rg1 = findViewById(R.id.rg)

        text1.setVisibility(View.INVISIBLE)
        rb1.setVisibility(View.INVISIBLE)
        rb2.setVisibility(View.INVISIBLE)
        rb3.setVisibility(View.INVISIBLE)
        btn.setVisibility(View.INVISIBLE)

        chb1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (chb1.isChecked) {
                text1.setVisibility(View.VISIBLE)
                rb1.setVisibility(View.VISIBLE)
                rb2.setVisibility(View.VISIBLE)
                rb3.setVisibility(View.VISIBLE)
                btn.setVisibility(View.VISIBLE)
            }
            else {
                text1.setVisibility(View.INVISIBLE)
                rb1.setVisibility(View.INVISIBLE)
                rb2.setVisibility(View.INVISIBLE)
                rb3.setVisibility(View.INVISIBLE)
                img.setVisibility(View.INVISIBLE)
                btn.setVisibility(View.INVISIBLE)
            }

        }
        btn.setOnClickListener {
            rg1.setOnCheckedChangeListener{group, checkedId ->}
            if (rb1.isChecked){
                img.setImageResource(R.drawable.dog)
            }
            if (rb2.isChecked){
                img.setImageResource(R.drawable.cat)
            }
            if (rb3.isChecked){
                img.setImageResource(R.drawable.rabbit)
            }
        }
    }
}