package com.salim.oonaoutoforder;

import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Full_Screen extends AppCompatActivity {
    Button exit;
    PDFView pdfView;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full__screen);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("oona.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
        pdfView.useBestQuality(true);
        //pdfView.jumpTo(page,false);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        exit=findViewById(R.id.fullscreenexit);
        exit.setOnClickListener(v -> this.finish());


    }
}