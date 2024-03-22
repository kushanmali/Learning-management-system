package com.example.nsbm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class courses extends AppCompatActivity {
    CardView clothingCard;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clothingCard = findViewById(R.id.clothingCard);
        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(courses.this, materials.class);
                startActivity(intent);         }

            private void startActivity(Intent intent) {

            }
        });
    }
}