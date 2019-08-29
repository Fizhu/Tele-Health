package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt7Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart7;
    private WebView djart7;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart7);

        djart7 = (WebView) findViewById(R.id.webart7);
        djart7.getSettings().setJavaScriptEnabled(true);
        djart7.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart7.loadUrl("http://www.rs-premierbintaro.com/page/info-sehat/jangan-sepelekan-gangguan-irama-jantung/");

        tblbackart7 = (View) findViewById(R.id.bhdjart7);
        tblbackart7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart7){
            startActivity(new Intent(DJArt7Activity.this,DJDTActivity.class));
        }
    }
}
