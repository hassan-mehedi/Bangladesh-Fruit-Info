package com.example.fruitinfoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    private Button all_fruits;
    private Button search_fruits;
    private Button fruits_related_videos;
    private Button feedback;
    private Button about_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        all_fruits = findViewById(R.id.allFruitsId);
        search_fruits = findViewById(R.id.searchFruitsId);
        fruits_related_videos = findViewById(R.id.fruitRelatedVideosId);
        feedback = findViewById(R.id.feedbackId);
        about_us = findViewById(R.id.aboutUsId);

        all_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,AllFruits.class);
                startActivity(intent);
            }
        });
        search_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,SearchFruits.class);
                startActivity(intent);
            }
        });
        fruits_related_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,FruitRelatedVideos.class);
                startActivity(intent);
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,Feedback.class);
                startActivity(intent);
            }
        });
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,AboutUs.class);
                startActivity(intent);
            }
        });

    }

}
