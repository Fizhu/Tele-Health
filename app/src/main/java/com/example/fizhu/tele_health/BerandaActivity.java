package com.example.fizhu.tele_health;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BerandaActivity extends AppCompatActivity implements View.OnClickListener{

    private View btHB, btSUHU, btKELUAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btHB = (View) findViewById(R.id.tblHB);
        btSUHU = (View) findViewById(R.id.tblSUHU);
        btKELUAR = (View) findViewById(R.id.tblKELUAR);

        btHB.setOnClickListener(this);
        btSUHU.setOnClickListener(this);
        btKELUAR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btHB){
            startActivity(new Intent(BerandaActivity.this, DetakJantungActivity.class));
        }
        if (v == btSUHU){
            startActivity(new Intent(BerandaActivity.this, SuhuBadanActivity.class));
        }
        if (v == btKELUAR){
            onBackPressed();
        }

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            finish();
            moveTaskToBack(true);
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan Sekali Lagi Untuk Keluar", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
