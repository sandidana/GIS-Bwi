package com.example.gis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper flipper;
    ImageView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koding slideshow
        int images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
        flipper = findViewById(R.id.slide_show);

        //ngulang gambar
        for (int image: images){
            flipperImages(image);
        }


        //kodingan img view
        ImageView btnmap = findViewById(R.id.btn1);
        btnmap.setOnClickListener(this);

        ImageView btn = findViewById(R.id.btn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }

    public void flipperImages(int image){

        ImageView imgView = new ImageView(this);
        imgView.setBackgroundResource(image);

        flipper.addView(imgView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        //animasi
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    @Override
    public void onClick(View view) {
        Intent pindahmap = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(pindahmap);
    }
}
