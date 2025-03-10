package com.chlyfenrichard.ecooling;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DashboardActivity extends AppCompatActivity {

    CardView laporSampah;
    CardView diskusi;
    CardView laporan;
    CardView profil;

    TextView textViewLogout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.dashboard_activity);

        laporSampah = findViewById(R.id.cardLaporSampah);
        diskusi = findViewById(R.id.cardEdukasi);
        laporan = findViewById(R.id.cardLaporan);
        profil = findViewById(R.id.cardProfil);
        textViewLogout = findViewById(R.id.textViewLogout);



        laporSampah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this,"Klik Lapor Sampah",Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(DashboarActivity.this,LaporSampahActivity.class);
                * startActivity(intent
                *
                *
                * */
            }
        });

        //Klik Diskusi
        diskusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this,"Klik diskusi",Toast.LENGTH_SHORT).show();
            }
        });

        //Klik Laporan
        laporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this,"Klik laporan",Toast.LENGTH_SHORT).show();
            }
        });

        //klik Profil
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this,"Klik Profil",Toast.LENGTH_SHORT).show();
            }
        });

        textViewLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
