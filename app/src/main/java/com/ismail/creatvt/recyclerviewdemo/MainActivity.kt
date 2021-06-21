package com.ismail.creatvt.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val emailList = arrayListOf(
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem."),
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem."),
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem."),
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem."),
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem."),
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem."),
        EmailItem(
            "Lorem ipsum dolor sit amet",
            "Donec magna erat, commodo vitae efficitur in, pretium quis dolor. Duis ornare efficitur ante nec fringilla. Etiam at arcu in libero iaculis posuere vitae non lorem.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email_list_rv.adapter = EmailAdapter(emailList)
        email_list_rv.layoutManager = LinearLayoutManager(this)
    }
}