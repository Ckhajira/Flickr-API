package com.example.techmarket.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.techmarket.R;

public class SuccessActivity extends AppCompatActivity {
    private TextView txtIntro, txtFormDetails;
    private Button moreInfoBtn;
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
        moreInfoBtn = findViewById(R.id.moreInfoBtn);

        txtFormDetails.setText("Hello " + formName + " We will deliver your painting to " + formAddress
        + ". In case of any inconveniences, we will call you on your phone " + formPhone);

        moreInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuccessActivity.this, MoreInfoActivity.class);
                startActivity(intent);
            }
        });

    }
}