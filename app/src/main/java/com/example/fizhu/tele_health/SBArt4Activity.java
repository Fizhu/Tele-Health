package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt4Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart4;
    private WebView sbart4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart4);

        sbart4 = (WebView) findViewById(R.id.webarts4);
        sbart4.getSettings().setJavaScriptEnabled(true);
        sbart4.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart4.loadUrl("https://hellosehat.com/penyakit/hipotermia-adalah/");

        tblbackart4 = (View) findViewById(R.id.bhsbart4);
        tblbackart4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart4){
            startActivity(new Intent(SBArt4Activity.this,SuhuDTActivity.class));
        }
    }
}
