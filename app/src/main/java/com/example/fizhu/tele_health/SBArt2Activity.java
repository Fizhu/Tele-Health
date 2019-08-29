package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt2Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart2;
    private WebView sbart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart2);

        sbart2 = (WebView) findViewById(R.id.webarts2);
        sbart2.getSettings().setJavaScriptEnabled(true);
        sbart2.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart2.loadUrl("https://www.alodokter.com/demam-naik-turun-bisa-jadi-tanda-3-penyakit-ini");

        tblbackart2 = (View) findViewById(R.id.bhsbart2);
        tblbackart2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart2){
            startActivity(new Intent(SBArt2Activity.this,SuhuDTActivity.class));
        }
    }
}
