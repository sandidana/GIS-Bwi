package com.example.gis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView datanama, dataharga, datades;
    ImageView datagambar;
    Button btnkembali;
    public static String id,nama, htiket, gambar;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.txtnama);
        dataharga=findViewById(R.id.txtharga);
        datagambar=findViewById(R.id.gmb1);

        datanama.setText(nama);
        dataharga.setText(htiket);
        Picasso.get().load(gambar).into(datagambar);

        btnkembali=findViewById(R.id.btnbek);
        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bek = new Intent(DetailActivity.this, MapsActivity.class);
                startActivity(bek);
            }
        });

    }
}
