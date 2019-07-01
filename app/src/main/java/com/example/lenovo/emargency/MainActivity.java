package com.example.lenovo.emargency;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity  {
    RecyclerView rv;
    Context context;
    CardView bank,amb,pol,fir,bld,blg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bank = findViewById(R.id.bankcardId);
        amb = findViewById(R.id.amb);
        pol = findViewById(R.id.police);
        fir = findViewById(R.id.fire);
        bld = findViewById(R.id.blood);

        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CardDemoActivity.class);
                startActivity(intent);
            }
        });

        amb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AmbulanceCardDemoActivity.class);
            startActivity(intent);
            }
        });
        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PoliceActivity.class);
                startActivity(intent);
            }
        });

        fir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FireActivity.class);
                startActivity(intent);
            }
        });
        bld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BloodActivity.class);
                startActivity(intent);
            }
        });

    }
}
