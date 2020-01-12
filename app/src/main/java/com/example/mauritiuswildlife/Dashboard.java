package com.example.mauritiuswildlife;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mauritiuswildlife.OurEcotour.OurEcotour;
import com.example.mauritiuswildlife.OurProjects.OurProjects;
import com.example.mauritiuswildlife.WhoAreWe.WhoAreWe;

public class Dashboard extends AppCompatActivity {

    private LinearLayout whoAreWe;
    private LinearLayout howToHelp;
    private LinearLayout ourEcotour;
    private LinearLayout ourProjects;
    private LinearLayout ourShop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        assignLinearLayouts();
        setOnClickListeners();

    }

    public void assignLinearLayouts(){

        whoAreWe    = findViewById(R.id.whoarewe);
        howToHelp   = findViewById(R.id.howtohelp);
        ourEcotour  = findViewById(R.id.ourecotour);
        ourProjects = findViewById(R.id.ourprojects);
        ourShop     = findViewById(R.id.ourShops);

    }



    public void setOnClickListeners(){

        whoAreWe.setOnClickListener(v -> {
            Intent i = new Intent(Dashboard.this, WhoAreWe.class);
            startActivity(i);
        });

        ourEcotour.setOnClickListener(v -> {
            Intent i = new Intent(Dashboard.this, OurEcotour.class);
            startActivity(i);
        });

        ourProjects.setOnClickListener(v -> {
            Intent i = new Intent(Dashboard.this, OurProjects.class);
            startActivity(i);
        });

        howToHelp.setOnClickListener(v -> {
            Intent i = new Intent(Dashboard.this, HowToHelp.class);
            startActivity(i);
        });

        ourShop.setOnClickListener(v -> {
            Intent i = new Intent(Dashboard.this, OurShops.class);
            startActivity(i);
        });

    }



}
