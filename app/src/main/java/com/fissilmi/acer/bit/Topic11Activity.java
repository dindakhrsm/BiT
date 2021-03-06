package com.fissilmi.acer.bit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

/**
 * Created by ACER on 28/12/2016.
 */

public class Topic11Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic);
        WebView mWebView;
        mWebView = (WebView) findViewById(R.id.webpt1);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/Lesson11.html");

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Topic11Activity.class);
                startActivity(intent);
            }
        });

        ImageButton next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Topic12Activity.class);
                startActivity(intent);
            }
        });

        ImageButton levelButton = (ImageButton) findViewById(R.id.levelButton);
        levelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PageMateri3Activity.class);
                startActivity(intent);
               // mp.stop();
            }

        });

        ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                //mp.stop();
            }

        });
    }
}
