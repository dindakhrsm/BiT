package com.fissilmi.acer.bit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class LevelActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);
        ImageButton level1 = (ImageButton) findViewById(R.id.level1);
        ImageButton level2 = (ImageButton) findViewById(R.id.level2);
        ImageButton level3 = (ImageButton) findViewById(R.id.level3);
        FloatingActionButton home = (FloatingActionButton) findViewById(R.id.home);

        level1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelActivity.this, PageMateri1Activity.class);
                startActivity(intent);
            }
        });

        level2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelActivity.this, PageMateri2Activity.class);
                startActivity(intent);
            }
        });

        level3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelActivity.this, PageMateri3Activity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
