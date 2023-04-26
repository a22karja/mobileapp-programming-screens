package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // on below line we are initializing variables with ids.
        TextView name = findViewById(R.id.name);

        // on below line we are setting our message to our text view.
        name.setText(getIntent().getStringExtra("name"));
    }
}