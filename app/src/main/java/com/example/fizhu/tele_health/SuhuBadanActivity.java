package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SuhuBadanActivity extends AppCompatActivity implements View.OnClickListener{
    private WebView sb;
    private View back2;
    private Button btSUHUDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu_badan);

        sb = (WebView) findViewById(R.id.websb);
        sb.getSettings().setJavaScriptEnabled(true);
        sb.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        sb.loadUrl("https://thingspeak.com/channels/596856/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=LM+35&type=line&xaxis=Time");

        back2 = (View) findViewById(R.id.backhome2);
        btSUHUDT = (Button) findViewById(R.id.tblSUHUDT);
        back2.setOnClickListener(this);
        btSUHUDT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == back2) {
            startActivity(new Intent(SuhuBadanActivity.this, BerandaActivity.class));
        }
        if (v == btSUHUDT){
            startActivity(new Intent(SuhuBadanActivity.this, SuhuDTActivity.class));
        }
    }
}
