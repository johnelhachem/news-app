package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val newsList = listOf(
            NewsItem("Tech Update", "New AI model released today.", R.drawable.img),
            NewsItem("Sports News", "Local team wins the championship!", R.drawable.img_1),
            NewsItem("Weather Alert", "Heavy rain expected this weekend.", R.drawable.img_2),
            NewsItem("Cooking Tips", "How to bake the perfect sourdough.", R.drawable.img_3),
            NewsItem("Science Discovery", "New planet found in nearby galaxy.", R.drawable.img_4),
            NewsItem("Art Exhibition", "Modern art show opens downtown.", R.drawable.img_5),
            NewsItem("Business Merger", "Two major companies to merge next month.", R.drawable.img_6),
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)

        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(divider)
    }
}