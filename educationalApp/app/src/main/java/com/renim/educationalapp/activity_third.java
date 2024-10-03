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

public class activity_third extends AppCompatActivity {

    Button button;
    GridView gridView;
    ArrayList<String> textThird = new ArrayList<>();
    ArrayList<Integer> imageThird = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button = findViewById(R.id.buttonthird);
        gridView = findViewById(R.id.gridViewThrid);
        fillArrayThird();
        GridAdapterForThird adapter = new GridAdapterForThird(this,textThird,imageThird);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Selected" + textThird.get(position), Toast.LENGTH_LONG).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
    public void fillArrayThird(){
        textThird.add("Car");
        textThird.add("Bus");
        textThird.add("Train");
        textThird.add("Airplane");
        textThird.add("Ship");
        textThird.add("Motorcycle");
        textThird.add("Bicycle");
        textThird.add("Subway");
        textThird.add("Tram");
        textThird.add("Taxi");
        textThird.add("Helicopter");
        textThird.add("Ferry");
        textThird.add("Truck");
        textThird.add("Minibus");
        textThird.add("Scooter");

        imageThird.add(R.drawable.car);
        imageThird.add(R.drawable.bus);
        imageThird.add(R.drawable.train);
        imageThird.add(R.drawable.airplane);
        imageThird.add(R.drawable.ship);
        imageThird.add(R.drawable.motorcycle);
        imageThird.add(R.drawable.bicycle);
        imageThird.add(R.drawable.subway);
        imageThird.add(R.drawable.tram);
        imageThird.add(R.drawable.taxi);
        imageThird.add(R.drawable.helicopter);
        imageThird.add(R.drawable.ferry);
        imageThird.add(R.drawable.truck);
        imageThird.add(R.drawable.minibus);
        imageThird.add(R.drawable.scooter);

        }
}