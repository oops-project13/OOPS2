package com.example.oops2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find button by ID
        Button button = findViewById(R.id.button);

        // Set click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Toast message
                Toast.makeText(MainActivity.this, "Welcome to OOPS Project :)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
