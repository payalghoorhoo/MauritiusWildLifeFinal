package com.example.mauritiuswildlife;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Brochure extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_brochure);

        WebView webView = findViewById(R.id.brochure);

        String url="https://www.mauritian-wildlife.org/mwf-files/files/files/E-Brochure%20PRODUCTS%20(LR).pdf";
        String finalurl = "http://drive.google.com/viewerng/viewer?embedded=true&url="+url;

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.loadUrl(finalurl);

    }
}

