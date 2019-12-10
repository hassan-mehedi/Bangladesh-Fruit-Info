package com.example.fruitinfoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import static com.example.fruitinfoapp.R.drawable.apple;
import static com.example.fruitinfoapp.R.drawable.banana;
import static com.example.fruitinfoapp.R.drawable.carambola;
import static com.example.fruitinfoapp.R.drawable.coconut;
import static com.example.fruitinfoapp.R.drawable.grape;
import static com.example.fruitinfoapp.R.drawable.guava;
import static com.example.fruitinfoapp.R.drawable.jack_fruit;
import static com.example.fruitinfoapp.R.drawable.jujubeim;
import static com.example.fruitinfoapp.R.drawable.lychee;
import static com.example.fruitinfoapp.R.drawable.mango;
import static com.example.fruitinfoapp.R.drawable.olive;
import static com.example.fruitinfoapp.R.drawable.papaya;
import static com.example.fruitinfoapp.R.drawable.pine_apple;
import static com.example.fruitinfoapp.R.drawable.plum;
import static com.example.fruitinfoapp.R.drawable.pomegranate;
import static com.example.fruitinfoapp.R.drawable.pomelo;
import static com.example.fruitinfoapp.R.drawable.tamarind;
import static com.example.fruitinfoapp.R.drawable.water_melon;

public class AllFruits extends AppCompatActivity {

    private GridView gridView;
    int[] image = new int[]{};
    String[] name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_fruits);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        gridView = findViewById(R.id.fruitListId);

        image = new int[]{apple,banana,carambola,coconut,
        guava,grape,jack_fruit,jujubeim,lychee,mango,olive,papaya,pine_apple,plum,pomegranate,
        pomelo,tamarind,water_melon};

        name  = getResources().getStringArray(R.array.fruit_name_list);
        CustomAdapter customAdapter = new CustomAdapter(AllFruits.this,name,image);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = name[position];

                Intent intent = new Intent(AllFruits.this,FruitDetails.class);
                intent.putExtra("name",value);
                startActivity(intent);
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
