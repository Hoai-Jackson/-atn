package com.engkids.Hoso_hoctap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.engkids.R;

public class Chon_tuoi extends AppCompatActivity {

    private ImageButton bnttieptuc3;
    private ImageButton imgbThoat12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hs_hoctap_tuoi);

        imgbThoat12 = (ImageButton) findViewById(R.id.imgbThoat12);

        imgbThoat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chon_tuoi.this, Nhap_ten.class);
                startActivity(intent);
            }
        });

        bnttieptuc3 = (ImageButton) findViewById(R.id.bnttieptuc3);

        bnttieptuc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chon_tuoi.this, Nam_sinh.class);
                startActivity(intent);
            }
        });
    }
}