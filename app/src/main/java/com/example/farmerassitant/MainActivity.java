package com.example.farmerassitant;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout predictDiseaseCard;
    LinearLayout diseaseHistoryCard;
    LinearLayout weatherForecastCard;
    LinearLayout aboutCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the card layouts
        predictDiseaseCard = findViewById(R.id.predict_disease_card);
        diseaseHistoryCard = findViewById(R.id.disease_history_card);
        weatherForecastCard = findViewById(R.id.weather_forecast_card);
        aboutCard = findViewById(R.id.about_card); // Add this if you have an about card

        // Set OnClickListener for Predict Disease card
        predictDiseaseCard.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CropSelection.class);
            startActivity(intent);
        });

        // Set OnClickListener for Disease History card
        diseaseHistoryCard.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Disease History clicked", Toast.LENGTH_SHORT).show();
            // Navigate to Disease History activity if you have one
        });

        // Set OnClickListener for Weather Forecast card
        weatherForecastCard.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Weather Forecast clicked", Toast.LENGTH_SHORT).show();
            // Navigate to Weather Forecast activity if you have one
        });

        // Set OnClickListener for About card
        aboutCard.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "About clicked", Toast.LENGTH_SHORT).show();
            // Navigate to About activity if you have one
        });
    }
}
