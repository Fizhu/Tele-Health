package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class DetakJantungActivity extends AppCompatActivity implements View.OnClickListener{
    private WebView dj;
    private View back1;
    private Button btdj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detak_jantung);

        dj = (WebView) findViewById(R.id.webdj);
        dj.getSettings().setJavaScriptEnabled(true);
        dj.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        dj.loadUrl("https://thingspeak.com/channels/596856/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=Pulse+Sensor&type=line&xaxis=Time");

        back1 = (View) findViewById(R.id.backhome1);
        btdj = (Button) findViewById(R.id.tblDJDT);
        back1.setOnClickListener(this);
        btdj.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == back1) {
            startActivity(new Intent(DetakJantungActivity.this, BerandaActivity.class));
        }
        if (v == btdj) {
            startActivity(new Intent(DetakJantungActivity.this, DJDTActivity.class));
        }
    }
}
