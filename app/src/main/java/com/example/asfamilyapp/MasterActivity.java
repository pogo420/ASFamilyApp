package com.example.asfamilyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MasterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        findViewById(R.id.calc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MasterActivity.this, "Ola", Toast.LENGTH_SHORT).show(); // Classname.this --> for outer class
                startActivity(new Intent(MasterActivity.this, CalculatorActivity.class));
            }
        });
    }
}