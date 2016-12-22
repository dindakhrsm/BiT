package com.example.acer.bit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

/**
 * Created by ACER on 22/12/2016.
 */

public class Topic2Activity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic);
        WebView mWebView;
        mWebView = (WebView) findViewById(R.id.webpt1);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/Lesson2.html");

        ImageButton next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Topic3Activity.class);
                startActivity(intent);
            }
        });

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PageMateriActivity.class);
                startActivity(intent);
            }
        });
        // Get the button from the view
        ImageButton huruf = (ImageButton) this.findViewById(R.id.huruf);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.makharijulhuruf);
        huruf.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         if (mp.isPlaying()) {
                                             mp.pause();
                                         }
                                         else {
                                             mp.start();
                                         }
                                     }
                                 }
        );

    }

}
