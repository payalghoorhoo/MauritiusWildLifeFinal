package com.example.mauritiuswildlife;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mauritiuswildlife.OurProjects.OurProjects;

public class OurShops extends AppCompatActivity {
    Button brochure;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ourshops);

        setBackButton();
        dialog = new Dialog(this);
    }

    public void setBackButton(){

        ImageView back = findViewById(R.id.our_shops_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(OurShops.this, Dashboard.class);
            startActivity(i);
        });

    }

    public void openBrochure(View view) {
        TextView textView;
        Button btn;
        dialog.setContentView(R.layout.popup_brochure);
        textView= dialog.findViewById(R.id.xBrochure);
        btn= dialog.findViewById(R.id.btn_brochure);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}
