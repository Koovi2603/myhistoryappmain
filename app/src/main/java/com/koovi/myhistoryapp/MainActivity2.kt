package com.koovi.myhistoryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //initialise
        searchButton = findViewById(R.id.search)
        clearButton = findViewById(R.id.clear)
        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)



        searchButton.setOnClickListener {
            //create a variable of age to get value from user
            val age = editText.text.toString().toIntOrNull()

            //if age is not null and age is in the range between
            if (age != null && age in 20..100) {

                //when age 21 display Juice WRLD  else when is .. and so on
                val historicalfigureName = when (age) {
                    21 -> "Juice WRLD was a music artist who died on December 8 2019."
                    25 -> "Tupac Shakur known as 2pac was an african american rapper who died September 13 1996"
                    36 -> "Bob Marley was a Jamaican singer who died May 11 1981"
                    40 -> "Paul Walker was a famous American actor who died on November 30 2013"
                    41 -> "Kobe Bryant was an American professional basketball player who died on January 26 2020"
                    45 -> "Freddie Mercury was a British rock singer and song writer who died on November 24 1991"
                    46 -> "John F. Kennedy was the 35th president of the United States who was assassinated on November 22 1963"
                    48 -> "Whitney Houston was a famous American singer and actress who died on February 11 2012"
                    78 -> "Mahatma Ghandi was an Indian lawyer, politician, social activist and writer on died on January 30 1948"
                    60 -> "Diego Maradona was an Argentinian football player who died on November 25 2020"
                    62 -> "Elvis Presley was a famous American singer who died on August 16 1977"
                    63 -> "Robin Williams was an American comedian actor who died on August 11 2014"
                    else -> null
                }

                val message = if (historicalfigureName != null) "The Historical Figure's name is $historicalfigureName."
                else "No Historical Figure found with the entered age."
                textView.text = message


            }else {
                textView.text = "invalid input. Please enter a valid age between 20 and 100."
            }
        }

        clearButton.setOnClickListener {
            editText.text.clear()
            textView.text=""

        }
    }}