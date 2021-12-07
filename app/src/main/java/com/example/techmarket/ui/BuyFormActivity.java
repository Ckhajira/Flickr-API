package com.example.techmarket.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.techmarket.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuyFormActivity extends AppCompatActivity {
    @BindView(R.id.editTxtName) EditText editTxtName;
    @BindView(R.id.editTxtAddress) EditText editTxtAddress;
    @BindView(R.id.editTxtPhone) EditText editTxtPhone;
    @BindView(R.id.btnBuyFormSubmit) Button btnBuyFormSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_form);
        ButterKnife.bind(this);



        btnBuyFormSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formName = editTxtName.getText().toString();
                String formAddress = editTxtAddress.getText().toString();
                String formPhone = editTxtPhone.getText().toString();
                Intent intent = new Intent(BuyFormActivity.this, SuccessActivity.class);
            intent.putExtra("formName", formName);
            intent.putExtra("formAddress", formAddress);
            intent.putExtra("formPhone", formPhone);
                startActivity(intent);
                Toast.makeText(BuyFormActivity.this, "Successfully Submitted", Toast.LENGTH_LONG).show();}
        });
    }
}