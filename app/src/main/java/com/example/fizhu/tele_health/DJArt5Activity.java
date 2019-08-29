package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt5Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart5;
    private WebView djart5;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart5);

        djart5 = (WebView) findViewById(R.id.webart5);
        djart5.getSettings().setJavaScriptEnabled(true);
        djart5.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart5.loadUrl("https://www.alodokter.com/jantung-berdebar.html");

        tblbackart5 = (View) findViewById(R.id.bhdjart5);
        tblbackart5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart5){
            startActivity(new Intent(DJArt5Activity.this,DJDTActivity.class));
        }
    }
}
