package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt3Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart3;
    private WebView djart3;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart3);

        djart3 = (WebView) findViewById(R.id.webart3);
        djart3.getSettings().setJavaScriptEnabled(true);
        djart3.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart3.loadUrl("https://hellosehat.com/hidup-sehat/tips-sehat/mengatasi-jantung-berdebar-debar/");

        tblbackart3 = (View) findViewById(R.id.bhdjart3);
        tblbackart3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart3){
            startActivity(new Intent(DJArt3Activity.this,DJDTActivity.class));
        }
    }
}
