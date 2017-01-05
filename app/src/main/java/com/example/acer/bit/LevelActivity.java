package com.example.acer.bit;

import android.content.Intent;
import android.os.Bundle;
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

        level1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelActivity.this, PageMateriActivity.class);
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

    }

}
