package com.example.wattpad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cerita extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.cerita);
    }

    public void click1(View view) {
        Intent i = new Intent(this,cerita.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent i = new Intent(this,cari.class);
        startActivity(i);
    }

    public void click3(View view) {
        Intent i = new Intent(this,buatcerita.class);
        startActivity(i);
    }{
}}
