package com.engkids.Dang_nhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.engkids.R;

public class Khao_sat extends AppCompatActivity {

    private ImageButton bntyes;
    private ImageButton bntno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khao_sat);

        bntyes = (ImageButton) findViewById(R.id.bntyes);

        bntyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Khao_sat.this, Dang_nhap.class);
                startActivity(intent);
            }
        });

        bntno = (ImageButton) findViewById(R.id.bntno);

        bntno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Khao_sat.this, Dang_ky_sdt.class);
                startActivity(intent);
            }
        });

    }
}