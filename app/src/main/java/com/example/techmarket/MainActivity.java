package com.example.techmarket;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;

import androidx.appcompat.app.AppCompatActivity;

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

                Intent intent = new Intent(MainActivity.this, AllProductsActivity.class);
                startActivity(intent);

            }
        });
    }
}