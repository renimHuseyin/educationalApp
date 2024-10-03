package com.renim.educationalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    Button buton1, buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton1 = findViewById(R.id.button);
        buton2 = findViewById(R.id.button2);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_second.class);
                startActivity(i);
            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_third.class);
                startActivity(i);
            }
        });

    }
}