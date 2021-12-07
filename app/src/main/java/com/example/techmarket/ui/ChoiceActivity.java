package com.example.techmarket.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.techmarket.R;

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

        marketPlaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceActivity.this, AllProductsActivity.class);
                startActivity(intent);
            }
        });
        flickrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceActivity.this, InterestingPhotosActivity.class );
                startActivity(intent);
            }
        });

    }
}