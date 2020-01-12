package com.example.mauritiuswildlife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HowToHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtohelp);

        setBackButton();
        setText();

    }

    public void setText(){

        TextView help = findViewById(R.id.howtohelptext);

        help.setText(getResources().getString(R.string.how_to_help_text));

    }

    public void setBackButton(){

        ImageView back = findViewById(R.id.how_to_help_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(HowToHelp.this, Dashboard.class);
            startActivity(i);
        });

    }

}
