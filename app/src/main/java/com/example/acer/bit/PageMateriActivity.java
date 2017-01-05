package com.example.acer.bit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageMateriActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_level1);
        FloatingActionButton materiA1 = (FloatingActionButton) findViewById(R.id.materiA1);
        FloatingActionButton materiA2 = (FloatingActionButton) findViewById(R.id.materiA2);
        FloatingActionButton materiA3 = (FloatingActionButton) findViewById(R.id.materiA3);
        FloatingActionButton materiA4 = (FloatingActionButton) findViewById(R.id.materiA4);
        FloatingActionButton materiA5 = (FloatingActionButton) findViewById(R.id.materiA5);
        FloatingActionButton quiz1 = (FloatingActionButton) findViewById(R.id.quiz1);

        materiA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, TopicActivity.class);
                startActivity(intent);
            }
        });

        materiA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic2Activity.class);
                startActivity(intent);
            }
        });

        materiA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic3Activity.class);
                startActivity(intent);
            }
        });

        materiA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic4Activity.class);
                startActivity(intent);
            }
        });

        materiA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, Topic5Activity.class);
                startActivity(intent);
            }
        });

        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageMateriActivity.this, QuestionActivity.class);
                startActivity(intent);
            }
        });

    }
}
