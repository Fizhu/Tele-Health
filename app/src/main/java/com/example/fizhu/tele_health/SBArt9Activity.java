package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt9Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart9;
    private WebView sbart9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart9);

        sbart9 = (WebView) findViewById(R.id.webarts9);
        sbart9.getSettings().setJavaScriptEnabled(true);
        sbart9.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart9.loadUrl("https://www.alodokter.com/hipotermia");

        tblbackart9 = (View) findViewById(R.id.bhsbart9);
        tblbackart9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart9){
            startActivity(new Intent(SBArt9Activity.this,SuhuDTActivity.class));
        }
    }
}
