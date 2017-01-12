package com.example.acer.bit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageMateri3Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_level3);
        FloatingActionButton materiC1 = (FloatingActionButton) findViewById(R.id.materiC1);
        FloatingActionButton materiC2 = (FloatingActionButton) findViewById(R.id.materiC2);
        FloatingActionButton materiC3 = (FloatingActionButton) findViewById(R.id.materiC3);
        FloatingActionButton quiz3 = (FloatingActionButton) findViewById(R.id.quiz3);


        materiC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri3Activity.this, Topic11Activity.class);
                startActivity(intent);
            }
        });

        materiC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri3Activity.this, Topic12Activity.class);
                startActivity(intent);
            }
        });

        materiC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri3Activity.this, Topic13Activity.class);
                startActivity(intent);
            }
        });

        quiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateri3Activity.this, Question2Activity.class);
                startActivity(intent);
            }
        });

    }
}
