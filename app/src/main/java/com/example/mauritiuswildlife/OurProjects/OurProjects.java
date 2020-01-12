package com.example.mauritiuswildlife.OurProjects;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mauritiuswildlife.Dashboard;
import com.example.mauritiuswildlife.OurEcotour.OurEcotour;
import com.example.mauritiuswildlife.R;


public class OurProjects extends AppCompatActivity {

    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ourprojects);

        setBackButton();

        dialog = new Dialog(this);

    }

    public void setBackButton(){

        ImageView back = findViewById(R.id.our_project_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(OurProjects.this, Dashboard.class);
            startActivity(i);
        });

    }

    public void ShowPopUpFlora1(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_flora1);
        textView= dialog.findViewById(R.id.xFlora1);
        btn= dialog.findViewById(R.id.btn_flora1);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpFlora2(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_flora2);
        textView= dialog.findViewById(R.id.xFlora2);
        btn= dialog.findViewById(R.id.btn_flora2);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpFauna1(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_fauna1);
        textView= dialog.findViewById(R.id.xFauna1);
        btn= dialog.findViewById(R.id.btn_fauna1);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpFauna2(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_fauna2);
        textView= dialog.findViewById(R.id.xFauna2);
        btn= dialog.findViewById(R.id.btn_fauna2);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();


    }

    public void ShowPopUpFauna3(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_fauna3);
        textView= dialog.findViewById(R.id.xFauna3);
        btn= dialog.findViewById(R.id.btn_fauna3);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();


    }

    public void ShowPopUpFauna4(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_fauna4);
        textView= dialog.findViewById(R.id.xFauna4);
        btn= dialog.findViewById(R.id.btn_fauna4);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpFauna5(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_fauna5);
        textView= dialog.findViewById(R.id.xFauna5);
        btn= dialog.findViewById(R.id.btn_fauna5);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpFauna6(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_fauna6);
        textView= dialog.findViewById(R.id.xFauna6);
        btn= dialog.findViewById(R.id.btn_fauna6);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpIslet1(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_islet1);
        textView= dialog.findViewById(R.id.xIslet1);
        btn= dialog.findViewById(R.id.btn_islet1);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpIslet2(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_islet2);
        textView= dialog.findViewById(R.id.xIslet2);
        btn= dialog.findViewById(R.id.btn_islet2);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpIslet3(View v){
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_islet3);
        textView= dialog.findViewById(R.id.xIslet3);
        btn= dialog.findViewById(R.id.btn_islet3);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }



}

