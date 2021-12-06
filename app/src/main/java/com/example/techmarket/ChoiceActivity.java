package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoiceActivity extends AppCompatActivity {
        @BindView(R.id.marketPlaceBtnView) Button marketPlaceBtn;
    @BindView(R.id.FlickrBtnView) Button flickrBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        ButterKnife.bind(this);
    }
}