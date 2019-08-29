package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt8Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart8;
    private WebView djart8;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart8);

        djart8 = (WebView) findViewById(R.id.webart8);
        djart8.getSettings().setJavaScriptEnabled(true);
        djart8.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart8.loadUrl("https://meetdoctor.com/article/aritmia-ketika-detak-jantung-abnormal");

        tblbackart8 = (View) findViewById(R.id.bhdjart8);
        tblbackart8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart8){
            startActivity(new Intent(DJArt8Activity.this,DJDTActivity.class));
        }
    }
}
