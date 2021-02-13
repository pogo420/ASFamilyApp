package com.example.asfamilyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        findViewById(R.id.emi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MasterActivity.this, "Ola", Toast.LENGTH_SHORT).show(); // Classname.this --> for outer class
                startActivity(new Intent(CalculatorActivity.this, EmiCalcActivity.class));
            }
        });
    }
}