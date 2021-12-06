package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;

public class ChoiceActivity extends AppCompatActivity {
        @BindView(R.id.marketPlaceBtnView) Button marketPlaceBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }
}