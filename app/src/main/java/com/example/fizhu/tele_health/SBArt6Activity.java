package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt6Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart6;
    private WebView sbart6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart6);

        sbart6 = (WebView) findViewById(R.id.webarts6);
        sbart6.getSettings().setJavaScriptEnabled(true);
        sbart6.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart6.loadUrl("https://www.slideshare.net/mobile/naufallmuhammad7/artikel-kesehatan-tubuh-tentang-efek-udara-panas");

        tblbackart6 = (View) findViewById(R.id.bhsbart6);
        tblbackart6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart6){
            startActivity(new Intent(SBArt6Activity.this,SuhuDTActivity.class));
        }
    }
}
