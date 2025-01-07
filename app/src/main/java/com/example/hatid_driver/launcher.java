package com.example.hatid_driver;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class launcher extends AppCompatActivity { // Class name should follow Java naming conventions (PascalCase)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher); // Ensure you set a layout resource
    }
}
