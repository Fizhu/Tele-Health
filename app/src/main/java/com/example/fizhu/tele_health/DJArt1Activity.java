package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt1Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart1;
    private WebView djart1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart1);

        djart1 = (WebView) findViewById(R.id.webart1);
        djart1.getSettings().setJavaScriptEnabled(true);
        djart1.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart1.loadUrl("http://nakita.grid.id/read/0224953/detak-jantung-tak-beraturan-waspada-itu-gejala-serangan-stroke?page=all");

        tblbackart1 = (View) findViewById(R.id.bhdjart1);
        tblbackart1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart1){
            startActivity(new Intent(DJArt1Activity.this,DJDTActivity.class));
        }
    }
}
