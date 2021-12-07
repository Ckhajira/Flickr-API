package com.example.techmarket.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import com.example.techmarket.R;
import com.example.techmarket.models.InterestingPhoto;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.techmarket.databinding.ActivityInterestingPhotosBinding;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InterestingPhotosActivity extends AppCompatActivity {
    @BindView(R.id.goHomeBtn)
    Button goHomeBtn;
    private AppBarConfiguration appBarConfiguration;
    private ActivityInterestingPhotosBinding binding;

    List<InterestingPhoto> interestingPhotoList;
    int currPhotoIndex = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInterestingPhotosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ButterKnife.bind(this);
        setSupportActionBar(binding.toolbar);

        goHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InterestingPhotosActivity.this, ChoiceActivity.class);
                startActivity(intent);
            }
        });


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Fetching Next Photo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                nextPhoto();
            }
        });
        PaintingActivity flickrAPI = new PaintingActivity(this);
        flickrAPI.fetchInterestingPhotos();
    }

    public void receivedInterestingPhotos(List<InterestingPhoto> interestingPhotoList){
        this.interestingPhotoList = interestingPhotoList;
        nextPhoto();
    }
    public void nextPhoto(){
        if(interestingPhotoList != null && interestingPhotoList.size() >0){
            currPhotoIndex++;
            currPhotoIndex %= interestingPhotoList.size();

            TextView titleTextView = findViewById(R.id.titleTextView);
            TextView dateTakenTextView = findViewById(R.id.dateTakenTextView);

            InterestingPhoto interestingPhoto = interestingPhotoList.get(currPhotoIndex);
            titleTextView.setText(interestingPhoto.getTitle());
            dateTakenTextView.setText(interestingPhoto.getDateTaken());

            //TODO: come back and add support to fetch the source image
            //using interestingPhoto.getPhotoURL()

            PaintingActivity flickrAPI = new PaintingActivity(this);
            flickrAPI.fetchPhotoBitmap(interestingPhoto.getPhotoURL());

        }
    }
    //GS:added
    public void receivedPhotoBitmap(Bitmap bitmap){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(bitmap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}