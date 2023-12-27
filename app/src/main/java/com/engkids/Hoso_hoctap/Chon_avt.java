package com.engkids.Hoso_hoctap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.engkids.R;

public class Chon_avt extends AppCompatActivity {

    private ImageButton imgbThoat13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hs_chon_avt);

        imgbThoat13 = (ImageButton) findViewById(R.id.imgbThoat13);
        imgbThoat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chon_avt.this, Nam_sinh.class);
                startActivity(intent);
            }
        });
    }
}