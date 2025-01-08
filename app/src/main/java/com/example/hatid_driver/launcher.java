package com.example.hatid_driver;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class launcher extends AppCompatActivity { // Class name corrected to PascalCase
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher); // Set the layout for the launcher activity

        new Handler().postDelayed(() -> {
            // Create an Intent to transition to the MainActivity after the delay
            Intent intent = new Intent(launcher.this, MainActivity.class);
            startActivity(intent); // Start the MainActivity
            finish(); // Finish the Launcher activity so it doesn't appear in the back stack
        }, 3000); // 3000 milliseconds (3 seconds) delay before transitioning

        // Hide the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
