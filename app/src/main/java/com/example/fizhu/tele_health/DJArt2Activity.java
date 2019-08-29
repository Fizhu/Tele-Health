package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt2Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart2;
    private WebView djart2;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart2);

        djart2 = (WebView) findViewById(R.id.webart2);
        djart2.getSettings().setJavaScriptEnabled(true);
        djart2.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart2.loadUrl("http://m.bisnis.com/lifestyle/read/20180202/106/733744/jangan-remehkan-detak-jantung-yang-tiba-tiba-cepat-ini-bahayanya");

        tblbackart2 = (View) findViewById(R.id.bhdjart2);
        tblbackart2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart2){
            startActivity(new Intent(DJArt2Activity.this,DJDTActivity.class));
        }
    }
}
