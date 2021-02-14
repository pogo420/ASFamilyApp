package com.example.asfamilyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EmiCalcActivity extends AppCompatActivity {

    private double calculateEMI(double principal, double rate, double tenure){
        // logic for calculating EMI
        double monthRate = rate/12;
        double emi = principal * monthRate * (Math.pow(1+monthRate, tenure)/(Math.pow(1+monthRate, tenure)-1));
        return emi;
    }

    private String getData(int resource){
        // logic for getting data from text box
        TextView data = (TextView) findViewById(resource);
        return data.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calc);

        findViewById(R.id.trigger_calc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(EmiCalcActivity.this, getData(R.id.loan_amount), Toast.LENGTH_SHORT).show(); // Classname.this --> for outer class
                try {
                    double loanAmount = Double.parseDouble(getData(R.id.loan_amount));
                    double rate = Double.parseDouble(getData(R.id.rate));
                    double tenure = Double.parseDouble(getData(R.id.tenure));

                    double emi = calculateEMI(loanAmount, rate, tenure);
                    setData(R.id.emi_amount, emi);
                }
                catch (Exception  e){
                    Toast.makeText(EmiCalcActivity.this, "Values not supported", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setData(int emi_amount, double emi) {
        TextView data = (TextView) findViewById(emi_amount);
        data.setText(String.valueOf(Math.round(emi)));
    }

}