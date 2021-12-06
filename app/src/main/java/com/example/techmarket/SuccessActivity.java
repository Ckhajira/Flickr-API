package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {
    private TextView txtIntro, txtFormDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Intent intent = getIntent();
        String formName = intent.getStringExtra("formName");
        String formAddress = intent.getStringExtra("formAddress");
        String formPhone = intent.getStringExtra("formPhone");

        txtIntro = findViewById(R.id.txtIntro);
        txtFormDetails = findViewById(R.id.txtFormDetails);

        txtFormDetails.setText("Hello " + formName + " We will deliver your painting to " + formAddress
        + ". In case of any inconveniences, we will call you on your phone " + formPhone);


    }
}