package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SuhuDTActivity extends AppCompatActivity implements View.OnClickListener{
    private View btKeluar3;
    private CardView btArt1;
    private CardView btArt2;
    private CardView btArt3;
    private CardView btArt4;
    private CardView btArt5;
    private CardView btArt6;
    private CardView btArt7;
    private CardView btArt8;
    private CardView btArt9;
    private CardView btArt10;

    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu_dt);

        img1 = findViewById(R.id.imgst1);
        img2 = findViewById(R.id.imgst2);
        img3 = findViewById(R.id.imgst3);
        img4 = findViewById(R.id.imgst4);
        img5 = findViewById(R.id.imgst5);
        img6 = findViewById(R.id.imgst6);
        img7 = findViewById(R.id.imgst7);
        img8 = findViewById(R.id.imgst8);
        img9= findViewById(R.id.imgst9);
        img10 = findViewById(R.id.imgst10);

        loadGambar(img1);
        loadGambar(img2);
        loadGambar(img3);
        loadGambar(img4);
        loadGambar(img5);
        loadGambar(img6);
        loadGambar(img7);
        loadGambar(img8);
        loadGambar(img9);
        loadGambar(img10);

        btKeluar3 = (View) findViewById(R.id.backhome3);
        btArt1 = (CardView) findViewById(R.id.arts1);
        btArt2 = (CardView) findViewById(R.id.arts2);
        btArt3 = (CardView) findViewById(R.id.arts3);
        btArt4 = (CardView) findViewById(R.id.arts4);
        btArt5 = (CardView) findViewById(R.id.arts5);
        btArt6 = (CardView) findViewById(R.id.arts6);
        btArt7 = (CardView) findViewById(R.id.arts7);
        btArt8 = (CardView) findViewById(R.id.arts8);
        btArt9 = (CardView) findViewById(R.id.arts9);
        btArt10 = (CardView) findViewById(R.id.arts10);

        btKeluar3.setOnClickListener(this);
        btArt1.setOnClickListener(this);
        btArt2.setOnClickListener(this);
        btArt3.setOnClickListener(this);
        btArt4.setOnClickListener(this);
        btArt5.setOnClickListener(this);
        btArt6.setOnClickListener(this);
        btArt7.setOnClickListener(this);
        btArt8.setOnClickListener(this);
        btArt9.setOnClickListener(this);
        btArt10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btKeluar3){
            startActivity(new Intent(SuhuDTActivity.this, SuhuBadanActivity.class));
        }
        if (v == btArt1){
            startActivity(new Intent(SuhuDTActivity.this,SBArt1Activity.class));
        }
        if (v == btArt2){
            startActivity(new Intent(SuhuDTActivity.this,SBArt2Activity.class));
        }
        if (v == btArt3){
            startActivity(new Intent(SuhuDTActivity.this,SBArt3Activity.class));
        }
        if (v == btArt4){
            startActivity(new Intent(SuhuDTActivity.this,SBArt4Activity.class));
        }
        if (v == btArt5){
            startActivity(new Intent(SuhuDTActivity.this,SBArt5Activity.class));
        }
        if (v == btArt6){
            startActivity(new Intent(SuhuDTActivity.this,SBArt6Activity.class));
        }
        if (v == btArt7){
            startActivity(new Intent(SuhuDTActivity.this,SBArt7Activity.class));
        }
        if (v == btArt8){
            startActivity(new Intent(SuhuDTActivity.this,SBArt8Activity.class));
        }
        if (v == btArt9){
            startActivity(new Intent(SuhuDTActivity.this,SBArt9Activity.class));
        }
        if (v == btArt10){
            startActivity(new Intent(SuhuDTActivity.this,SBArt10Activity.class));
        }
    }

    void loadGambar(ImageView view) {
        Glide.with(this).load(R.drawable.bg1).into(view);
    }
}
