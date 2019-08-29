package com.example.fizhu.tele_health;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SBArt1Activity extends AppCompatActivity implements View.OnClickListener{
    private View tblbackart1;
    private WebView sbart1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbart1);

        sbart1 = (WebView) findViewById(R.id.webarts1);
        sbart1.getSettings().setJavaScriptEnabled(true);
        sbart1.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sbart1.loadUrl("https://m.suara.com/health/2016/05/12/202800/suhu-tubuh-berubah-ubah-gejala-penyakit-apa");

        tblbackart1 = (View) findViewById(R.id.bhsbart1);
        tblbackart1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tblbackart1){
            startActivity(new Intent(SBArt1Activity.this,SuhuDTActivity.class));
        }
    }
}
