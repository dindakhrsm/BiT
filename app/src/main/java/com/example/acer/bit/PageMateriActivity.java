package com.example.acer.bit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class PageMateriActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_level);
        FloatingActionButton materi1 = (FloatingActionButton) findViewById(R.id.materi1);
        FloatingActionButton materi2 = (FloatingActionButton) findViewById(R.id.materi2);
        FloatingActionButton materi3 = (FloatingActionButton) findViewById(R.id.materi3);
        FloatingActionButton materi4 = (FloatingActionButton) findViewById(R.id.materi4);
        FloatingActionButton materi5 = (FloatingActionButton) findViewById(R.id.materi5);
        FloatingActionButton materi6 = (FloatingActionButton) findViewById(R.id.materi6);
        FloatingActionButton materi7 = (FloatingActionButton) findViewById(R.id.materi7);
        FloatingActionButton materi8 = (FloatingActionButton) findViewById(R.id.materi8);
        FloatingActionButton materi9 = (FloatingActionButton) findViewById(R.id.materi9);
        FloatingActionButton materi10 = (FloatingActionButton) findViewById(R.id.materi10);


        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, TopicActivity.class);
                startActivity(intent);
            }
        });

        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic2Activity.class);
                startActivity(intent);
            }
        });

        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic3Activity.class);
                startActivity(intent);
            }
        });

        materi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic4Activity.class);
                startActivity(intent);
            }
        });

        materi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic5Activity.class);
                startActivity(intent);
            }
        });

        materi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic6Activity.class);
                startActivity(intent);
            }
        });

        materi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic7Activity.class);
                startActivity(intent);
            }
        });

        materi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic8Activity.class);
                startActivity(intent);
            }
        });

        materi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic9Activity.class);
                startActivity(intent);
            }
        });

        materi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic10Activity.class);
                startActivity(intent);
            }
        });

    }
}
