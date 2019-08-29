package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt4Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart4;
    private WebView djart4;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart4);

        djart4 = (WebView) findViewById(R.id.webart4);
        djart4.getSettings().setJavaScriptEnabled(true);
        djart4.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart4.loadUrl("https://www.obatjantungstroke.com/bradikardia/");

        tblbackart4 = (View) findViewById(R.id.bhdjart4);
        tblbackart4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart4){
            startActivity(new Intent(DJArt4Activity.this,DJDTActivity.class));
        }
    }
}
