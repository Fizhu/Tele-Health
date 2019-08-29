package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt10Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart10;
    private WebView sbart10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart10);

        sbart10 = (WebView) findViewById(R.id.webarts10);
        sbart10.getSettings().setJavaScriptEnabled(true);
        sbart10.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart10.loadUrl("http://www.thepanicchannel.com/health/suhu-tubuh-selalu-hangat-padahal-sedang-tidak-sakit-ini-penyebabnya/");

        tblbackart10 = (View) findViewById(R.id.bhsbart10);
        tblbackart10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart10){
            startActivity(new Intent(SBArt10Activity.this,SuhuDTActivity.class));
        }
    }
}
