package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt8Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart8;
    private WebView sbart8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart8);

        sbart8 = (WebView) findViewById(R.id.webarts8);
        sbart8.getSettings().setJavaScriptEnabled(true);
        sbart8.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart8.loadUrl("https://www.deherba.com/beberapa-penyakit-disebabkan-adanya-perubahan-suhu-tubuh.html");

        tblbackart8 = (View) findViewById(R.id.bhsbart8);
        tblbackart8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart8){
            startActivity(new Intent(SBArt8Activity.this,SuhuDTActivity.class));
        }
    }
}
