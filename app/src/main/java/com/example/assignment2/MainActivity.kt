package com.example.assignment2

import android.app.ActionBar
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var foods =listOf<String>( "Hamburger", "Pizza","Mexican", "American", "Chinese" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#57757f")))
        var add = findViewById<Button>(R.id.add)

        var decide = findViewById<Button>(R.id.decide)





        decide.setOnClickListener{
            val rnds = (0..4).random()
            setFood(foods[rnds])
            }

        add.setOnClickListener{
            var title = findViewById<EditText>(R.id.foodTitle)

            setFood(title.text.toString())
        }
    }

    fun setFood(food:String)
    {
        var view = findViewById<TextView>(R.id.textView)
        var image = findViewById<ImageView>(R.id.imageView)

        if(foods.indexOf(food)>-1)
            view.text=food
        else
            view.text="not existed"

        when(food){
            "Pizza"->{
                image.setImageResource(R.drawable.pizza)
            }
            "Hamburger"->{
                image.setImageResource(R.drawable.hamburger)
            }
            "Mexican"->{
                image.setImageResource(R.drawable.mexican)
            }
            "American"->{
                image.setImageResource(R.drawable.american)
            }
            "Chinese"->{
                image.setImageResource(R.drawable.chinise)
            }
            else->{
                image.setImageResource(R.drawable.dd_logo)
            }
        }
    }
}