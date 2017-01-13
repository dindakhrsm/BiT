package com.example.acer.bit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageMateri2Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_level2);
        FloatingActionButton materiB1 = (FloatingActionButton) findViewById(R.id.materiB1);
        FloatingActionButton materiB2 = (FloatingActionButton) findViewById(R.id.materiB2);
        FloatingActionButton materiB3 = (FloatingActionButton) findViewById(R.id.materiB3);
        FloatingActionButton materiB4 = (FloatingActionButton) findViewById(R.id.materiB4);
        FloatingActionButton materiB5 = (FloatingActionButton) findViewById(R.id.materiB5);
        FloatingActionButton quiz2 = (FloatingActionButton) findViewById(R.id.quiz2);
        FloatingActionButton home2 = (FloatingActionButton) findViewById(R.id.home2);

        materiB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri2Activity.this, Topic6Activity.class);
                startActivity(intent);
            }
        });

        materiB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri2Activity.this, Topic7Activity.class);
                startActivity(intent);
            }
        });

        materiB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri2Activity.this, Topic8Activity.class);
                startActivity(intent);
            }
        });

        materiB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri2Activity.this, Topic9Activity.class);
                startActivity(intent);
            }
        });

        materiB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri2Activity.this, Topic10Activity.class);
                startActivity(intent);
            }
        });

        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri2Activity.this, Question2Activity.class);
                startActivity(intent);
            }
        });

        home2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
