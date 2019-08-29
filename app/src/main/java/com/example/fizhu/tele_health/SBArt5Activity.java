package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt5Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart5;
    private WebView sbart5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart5);

        sbart5 = (WebView) findViewById(R.id.webarts5);
        sbart5.getSettings().setJavaScriptEnabled(true);
        sbart5.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart5.loadUrl("https://tirto.id/kawasaki-penyakit-langka-dengan-gejala-mirip-demam-berdarah-cxwo");

        tblbackart5 = (View) findViewById(R.id.bhsbart5);
        tblbackart5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart5){
            startActivity(new Intent(SBArt5Activity.this,SuhuDTActivity.class));
        }
    }
}
