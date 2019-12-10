package com.example.fruitinfoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    private EditText nameEditText, messageEditText;
    private Button sendButton;
    private String nameText, messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sendButton = findViewById(R.id.sendMessageButtonId);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameEditText = findViewById(R.id.nameId);
                messageEditText = findViewById(R.id.messageId);
                sendButton =  findViewById(R.id.sendMessageButtonId);

                nameText = nameEditText.getText().toString();
                messageText = messageEditText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"mehedihassan2420@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from the app");
                intent.putExtra(Intent.EXTRA_TEXT,"Name: "+ nameText + "\n" + "Message: " + messageText);
                startActivity(Intent.createChooser(intent,"Feedback with"));
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
