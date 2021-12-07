package com.example.techmarket.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.techmarket.R;
import com.example.techmarket.models.Product;

public class ProductActivity extends AppCompatActivity {

    private TextView txtProductName, txtProductPrice, txtProductDescription;
    private Button btnBuyNow;
    private ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initViews();

        btnBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this, BuyFormActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        if(null != intent){
            int productId = intent.getIntExtra("productId", -1);
            if (productId != -1){
                Product incomingProduct = getBookById(productId);
                if(null != incomingProduct){
                    setData(incomingProduct);
                }
            }
        }


    }

    public Product getBookById(int id){
        for(Product p : AllProductsActivity.getAll() ){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    private void setData(Product product){
        txtProductName.setText(product.getName());
        txtProductPrice.setText("KES: " + String.valueOf(product.getPrice()));
        txtProductDescription.setText("Description: " + product.getLongDesc());
        Glide.with(this)
                .asBitmap().load(product.getImageUrl())
                .into(productImage);
    }

    private void initViews(){
        txtProductName = findViewById(R.id.txtProductName);
        txtProductPrice = findViewById(R.id.txtProductPrice);
        txtProductDescription = findViewById(R.id.txtProductDescription);

        btnBuyNow = findViewById(R.id.btnBuyNow);

        productImage = findViewById(R.id.imgProduct);
    }
}