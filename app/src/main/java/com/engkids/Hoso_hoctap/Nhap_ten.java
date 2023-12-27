package com.engkids.Hoso_hoctap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.engkids.R;

public class Nhap_ten extends AppCompatActivity {

    private ImageButton bnttieptuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hs_hoctap_ten);

        bnttieptuc = (ImageButton) findViewById(R.id.bnttieptuc);
        bnttieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nhap_ten.this, Chon_tuoi.class);
                startActivity(intent);
            }
        });

    }
}