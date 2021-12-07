package com.example.techmarket.ui;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;

import androidx.appcompat.app.AppCompatActivity;

import com.example.techmarket.R;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
   @BindView(R.id.loginButton) Button mLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChoiceActivity.class);
                startActivity(intent);

            }
        });
    }
}