package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }
    public void openSecondActivity(){
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("name","JAG GILLAR HATTAR");
        startActivity(intent);
    }
}
