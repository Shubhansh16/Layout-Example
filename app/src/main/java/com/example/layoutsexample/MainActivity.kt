package com.example.layoutsexample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


@Suppress("UNCHECKED_CAST")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

    }

    private fun setListeners(){
        val box_one =findViewById<TextView>(R.id.box_one)
        val box_two =findViewById<TextView>(R.id.box_two)
        val textView2 =findViewById<TextView>(R.id.textView2)
        val textView3 =findViewById<TextView>(R.id.textView3)
        val textView4 =findViewById<TextView>(R.id.textView4)
        val constaint_layout =findViewById<ConstraintLayout>(R.id.constaint_layout)
        val red_button = findViewById<Button>(R.id.red_button)
        val yellow_button = findViewById<Button>(R.id.yellow_button)
        val green_button = findViewById<Button>(R.id.green_button)

        val clickableViews:List<View> =
            listOf(box_one, box_two, textView2, textView3, textView4, constaint_layout,red_button,yellow_button,green_button)

        for (item in clickableViews) {
            item.setOnClickListener{ makeColored(it)}
        }
    }
   private  fun makeColored(view: View) {

       val textView2 =findViewById<TextView>(R.id.textView2)
       val textView3 =findViewById<TextView>(R.id.textView3)
       val textView4 =findViewById<TextView>(R.id.textView4)

        when (view.id) {


            // Boxes using Color class colors for background
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.textView2 -> view.setBackgroundResource(R.color.greenlight)
            R.id.textView3 -> view.setBackgroundResource(R.color.greenlight)
            R.id.textView4 -> view.setBackgroundResource(R.color.greenlight)

            R.id.red_button -> textView2.setBackgroundResource(R.color.myred)
            R.id.yellow_button -> textView3.setBackgroundResource(R.color.myYellow)
            R.id.green_button -> textView4.setBackgroundResource(R.color.mygreen)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    fun setListeners(view: View) {}
}