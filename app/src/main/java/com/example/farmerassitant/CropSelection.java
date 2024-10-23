package com.example.farmerassitant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CropSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_selection);

        // Set click listeners for each crop option
        findViewById(R.id.wheat_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CropSelection.this, "Wheat selected", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CropSelection.this, UploadClickImage.class);
                startActivity(intent);            }
        });

        findViewById(R.id.rice_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CropSelection.this, "Rice selected", Toast.LENGTH_SHORT).show();
                // Navigate or handle rice selection
                Intent intent = new Intent(CropSelection.this, UploadClickImage.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tomato_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CropSelection.this, "Tomato selected", Toast.LENGTH_SHORT).show();
                // Navigate or handle tomato selection
                Intent intent = new Intent(CropSelection.this, UploadClickImage.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.potato_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CropSelection.this, "Potato selected", Toast.LENGTH_SHORT).show();
                // Navigate or handle potato selection
                Intent intent = new Intent(CropSelection.this, UploadClickImage.class);
                startActivity(intent);
            }
        });
    }
}
