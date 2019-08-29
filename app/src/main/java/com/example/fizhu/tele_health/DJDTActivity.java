package com.example.fizhu.tele_health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DJDTActivity extends AppCompatActivity implements View.OnClickListener{
    private View btKeluarjd;
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
        setContentView(R.layout.activity_djdt);

        img1 = findViewById(R.id.img_dj1);
        img2 = findViewById(R.id.img_dj2);
        img3 = findViewById(R.id.img_dj3);
        img4 = findViewById(R.id.img_dj4);
        img5 = findViewById(R.id.img_dj5);
        img6 = findViewById(R.id.img_dj6);
        img7 = findViewById(R.id.img_dj7);
        img8 = findViewById(R.id.img_dj8);
        img9= findViewById(R.id.img_dj9);
        img10 = findViewById(R.id.img_dj10);

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

        btKeluarjd = (View) findViewById(R.id.backhome4);
        btArt1 = (CardView) findViewById(R.id.art1);
        btArt2 = (CardView) findViewById(R.id.art2);
        btArt3 = (CardView) findViewById(R.id.art3);
        btArt4 = (CardView) findViewById(R.id.art4);
        btArt5 = (CardView) findViewById(R.id.art5);
        btArt6 = (CardView) findViewById(R.id.art6);
        btArt7 = (CardView) findViewById(R.id.art7);
        btArt8 = (CardView) findViewById(R.id.art8);
        btArt9 = (CardView) findViewById(R.id.art9);
        btArt10 = (CardView) findViewById(R.id.art10);

        btKeluarjd.setOnClickListener(this);
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
        if (v == btKeluarjd){
            startActivity(new Intent(DJDTActivity.this,DetakJantungActivity.class));
        }
        if (v == btArt1){
            startActivity(new Intent(DJDTActivity.this,DJArt1Activity.class));
        }
        if (v == btArt2){
            startActivity(new Intent(DJDTActivity.this,DJArt2Activity.class));
        }
        if (v == btArt3){
            startActivity(new Intent(DJDTActivity.this,DJArt3Activity.class));
        }
        if (v == btArt4){
            startActivity(new Intent(DJDTActivity.this,DJArt4Activity.class));
        }
        if (v == btArt5){
            startActivity(new Intent(DJDTActivity.this,DJArt5Activity.class));
        }
        if (v == btArt6){
            startActivity(new Intent(DJDTActivity.this,DJArt6Activity.class));
        }
        if (v == btArt7){
            startActivity(new Intent(DJDTActivity.this,DJArt7Activity.class));
        }
        if (v == btArt8){
            startActivity(new Intent(DJDTActivity.this,DJArt8Activity.class));
        }
        if (v == btArt9){
            startActivity(new Intent(DJDTActivity.this,DJArt9Activity.class));
        }
        if (v == btArt10){
            startActivity(new Intent(DJDTActivity.this,DJArt10Activity.class));
        }
    }

    void loadGambar(ImageView img) {
        Glide.with(this).load(R.drawable.bg1).into(img);
    }
}
