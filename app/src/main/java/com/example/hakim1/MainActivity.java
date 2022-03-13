package com.example.hakim1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

    }

    public void clickRumahSakit(View view) {
        Intent i = new Intent(this, RumahSakit.class);
        startActivity(i);
    }

    public void clickKantorPolisi(View view) {
        Intent i = new Intent(this, KantorPolisi.class);
        startActivity(i);
    }

    public void clickPusatPerbelanjaan(View view) {
        Intent i = new Intent(this, PusatPerbelanjaan.class);
        startActivity(i);
    }

    public void clickSekolah(View view) {
        Intent i = new Intent(this, Sekolah.class);
        startActivity(i);
    }
}