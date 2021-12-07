package com.example.techmarket.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.techmarket.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ContactUsFragment extends Fragment {
    @BindView(R.id.mWebsiteLabelBtn) Button mWebsiteLabelBtn;
    private TextView mWebsiteLabel;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_contact_us, container, false);
        ButterKnife.bind(this, view);

        mWebsiteLabelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getUrl()));
                startActivity(webIntent);
            }
        });
        return view;
    }
    public String getUrl(){
        return "https://pixabay.com";
    }
}