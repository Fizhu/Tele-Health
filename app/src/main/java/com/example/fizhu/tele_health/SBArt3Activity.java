package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt3Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart3;
    private WebView sbart3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart3);

        sbart3 = (WebView) findViewById(R.id.webarts3);
        sbart3.getSettings().setJavaScriptEnabled(true);
        sbart3.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart3.loadUrl("https://hellosehat.com/hidup-sehat/fakta-unik/apa-itu-hot-flashes-tubuh-panas/");

        tblbackart3 = (View) findViewById(R.id.bhsbart3);
        tblbackart3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart3){
            startActivity(new Intent(SBArt3Activity.this,SuhuDTActivity.class));
        }
    }
}
