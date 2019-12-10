package com.example.fruitinfoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitDetails extends AppCompatActivity {

    private TextView fruitNameText, infoText;
    private ImageView fruitImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        fruitNameText = findViewById(R.id.finTextViewId);
        infoText = findViewById(R.id.infoTextId);
        fruitImage = findViewById(R.id.finImageViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String fruit_name = bundle.getString("name");
            showPage(fruit_name);
        }
    }

    void showPage(String fruit_name){

        if(fruit_name.equals("Mango")){
            fruitImage.setImageResource(R.drawable.mango);
            fruitNameText.setText("Mango");
            infoText.setText(R.string.Mango);
        }
        if(fruit_name.equals("Apple")){
            fruitImage.setImageResource(R.drawable.apple);
            fruitNameText.setText("Apple");
            infoText.setText(R.string.Apple);
        }
        if(fruit_name.equals("Banana")){
            fruitImage.setImageResource(R.drawable.banana);
            fruitNameText.setText("Banana");
            infoText.setText(R.string.Banana);
        }
        if(fruit_name.equals("Carambola")){
            fruitImage.setImageResource(R.drawable.carambola);
            fruitNameText.setText("Carambola");
            infoText.setText(R.string.Carambola);
        }
        if(fruit_name.equals("Coconut")){
            fruitImage.setImageResource(R.drawable.coconut);
            fruitNameText.setText("Coconut");
            infoText.setText(R.string.Coconut);
        }
        if(fruit_name.equals("Tamarind")){
            fruitImage.setImageResource(R.drawable.tamarind);
            fruitNameText.setText("Tamarind");
            infoText.setText(R.string.Tamarind);
        }
        if(fruit_name.equals("Guava")){
            fruitImage.setImageResource(R.drawable.guava);
            fruitNameText.setText("Guava");
            infoText.setText(R.string.Guava);
        }
        if(fruit_name.equals("Grape")){
            fruitImage.setImageResource(R.drawable.grape);
            fruitNameText.setText("Grape");
            infoText.setText(R.string.Grape);
        }
        if(fruit_name.equals("Jackfruit")){
            fruitImage.setImageResource(R.drawable.jack_fruit);
            fruitNameText.setText("Jackfruit");
            infoText.setText(R.string.Jackfruit);
        }
        if(fruit_name.equals("Jujube")){
            fruitImage.setImageResource(R.drawable.jujubeim);
            fruitNameText.setText("Jujube");
            infoText.setText(R.string.Jujube);
        }
        if(fruit_name.equals("Lychee")){
            fruitImage.setImageResource(R.drawable.lychee);
            fruitNameText.setText("Lychee");
            infoText.setText(R.string.Lychee);
        }
        if(fruit_name.equals("Watermelon")){
            fruitImage.setImageResource(R.drawable.water_melon);
            fruitNameText.setText("Watermelon");
            infoText.setText(R.string.Watermelon);
        }
        if(fruit_name.equals("Oliva")){
            fruitImage.setImageResource(R.drawable.olive);
            fruitNameText.setText("Oliva");
            infoText.setText(R.string.Olive);
        }
        if(fruit_name.equals("Papaya")){
            fruitImage.setImageResource(R.drawable.papaya);
            fruitNameText.setText("Papaya");
            infoText.setText(R.string.Papaya);
        }if(fruit_name.equals("Pineapple")){
            fruitImage.setImageResource(R.drawable.pine_apple);
            fruitNameText.setText("Pineapple");
            infoText.setText(R.string.Pineapple);
        }if(fruit_name.equals("Plum")){
            fruitImage.setImageResource(R.drawable.plum);
            fruitNameText.setText("Plum");
            infoText.setText(R.string.Plum);
        }
        if(fruit_name.equals("Pomegranate")){
            fruitImage.setImageResource(R.drawable.pomegranate);
            fruitNameText.setText("Pomegranate");
            infoText.setText(R.string.Pomegranate);
        }
        if(fruit_name.equals("Pomelo")){
            fruitImage.setImageResource(R.drawable.pomelo);
            fruitNameText.setText("Pomelo");
            infoText.setText(R.string.Pomelo);
        }



    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
