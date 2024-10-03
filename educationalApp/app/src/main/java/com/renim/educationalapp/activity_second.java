package com.renim.educationalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_second extends AppCompatActivity {
    Button button;
    GridView gridView;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.buttonsecond);
        gridView = findViewById(R.id.gridView);
        fillArray();
        GridAdapterForSecond adapter =new GridAdapterForSecond(this,text,image);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Selected " + text.get(position), Toast.LENGTH_LONG).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
    public void fillArray(){
        text.add("Square");
        text.add("Circle");
        text.add("Triangle");
        text.add("Rectangle");
        text.add("Cylinder");
        text.add("Point");
        text.add("Correct");
        text.add("Parallelogram");
        text.add("Trapezoid");
        text.add("Equlateral");
        text.add("Cube");
        text.add("Cone");

        image.add(R.drawable.square);
        image.add(R.drawable.circle);
        image.add(R.drawable.triangle);
        image.add(R.drawable.rectangle);
        image.add(R.drawable.cylinder);
        image.add(R.drawable.point);
        image.add(R.drawable.correct);
        image.add(R.drawable.parallelogram);
        image.add(R.drawable.trapezoid);
        image.add(R.drawable.equlateral);
        image.add(R.drawable.cube);
        image.add(R.drawable.cone);
    }
}