package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DJArt9Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart9;
    private WebView djart9;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djart9);

        djart9 = (WebView) findViewById(R.id.webart9);
        djart9.getSettings().setJavaScriptEnabled(true);
        djart9.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        djart9.loadUrl("https://www.medistra.com/index.php?option=com_content&view=article&id=76");

        tblbackart9 = (View) findViewById(R.id.bhdjart9);
        tblbackart9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart9){
            startActivity(new Intent(DJArt9Activity.this,DJDTActivity.class));
        }
    }
}
