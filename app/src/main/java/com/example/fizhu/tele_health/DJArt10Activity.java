package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt10Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart10;
    private WebView djart10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart10);

        djart10 = (WebView) findViewById(R.id.webart10);
        djart10.getSettings().setJavaScriptEnabled(true);
        djart10.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart10.loadUrl("https://www.alodokter.com/lebih-jauh-tentang-penyakit-jantung-koroner");

        tblbackart10 = (View) findViewById(R.id.bhdjart10);
        tblbackart10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart10){
            startActivity(new Intent(DJArt10Activity.this,DJDTActivity.class));
        }
    }
}
