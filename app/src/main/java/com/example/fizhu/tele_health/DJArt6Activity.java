package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt6Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart6;
    private WebView djart6;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart6);

        djart6 = (WebView) findViewById(R.id.webart6);
        djart6.getSettings().setJavaScriptEnabled(true);
        djart6.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart6.loadUrl("http://www.1health.id/id/article/category/sehat-a-z/kenali-detak-jantung-anda.html");

        tblbackart6 = (View) findViewById(R.id.bhdjart6);
        tblbackart6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart6){
            startActivity(new Intent(DJArt6Activity.this,DJDTActivity.class));
        }
    }
}
