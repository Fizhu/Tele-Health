package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt7Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart7;
    private WebView sbart7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart7);

        sbart7 = (WebView) findViewById(R.id.webarts7);
        sbart7.getSettings().setJavaScriptEnabled(true);
        sbart7.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart7.loadUrl("https://hellosehat.com/hidup-sehat/tips-sehat/hipertermia-adalah-suhu-tubuh-panas/");

        tblbackart7 = (View) findViewById(R.id.bhsbart7);
        tblbackart7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart7){
            startActivity(new Intent(SBArt7Activity.this,SuhuDTActivity.class));
        }
    }
}
