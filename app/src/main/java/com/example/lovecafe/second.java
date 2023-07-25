package com.example.lovecafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    Button d1,d2,d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        d1=findViewById(R.id.coffee);
        d2=findViewById(R.id.pizza);
        d3=findViewById(R.id.momos);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (second.this, third.class);
                startActivity(i);
            }
        });


        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (second.this, forth.class);
                startActivity(i);
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (second.this, fith.class);
                startActivity(i);
            }
        });


    }
}