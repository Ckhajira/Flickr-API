package com.example.techmarket.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.techmarket.ProductRecViewAdapter;
import com.example.techmarket.R;
import com.example.techmarket.models.Product;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllProductsActivity extends AppCompatActivity {
  @BindView(R.id.productsRecView) RecyclerView productsRecView;

    private ProductRecViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products);
        ButterKnife.bind(this);


        adapter = new ProductRecViewAdapter(this);


        productsRecView.setAdapter(adapter);
        productsRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Tableau", 10000, "https://cdn.pixabay.com/photo/2017/07/03/20/17/colorful-2468874__480.jpg"
                ,"Best painting ever", "Piet Mondrian painted his iconic Tableau I. After a period of time experimenting with his emerging new voice, Tableau I solidified what would become Mondrian’s defining style. The hard black lines and compartmentalized color fields offered viewers a glimpse of purified geometry and mathematical precision. The clean lines and precision of the work made no reference to anything other than form, color and line. The work ushered in a style that would influence generations of painters, sculptors, architects and designers, and continues to guide creative thinkers today."));
        products.add(new Product(2, "The Death of Socrates ", 3000, "https://cdn.pixabay.com/photo/2021/07/16/19/57/the-death-of-socrates-6471743__480.png"
                ,"Best painting ever", "The Death of Socrates is a neo-classical art piece painted by a French painter Jacques-Louis David in 1787. This painting portrayed the classical theme of the ‘trial and execution of Socrates’ with an underlying message of resistance against France’s unfair ruling authority during those times. Few years after this painting was drawn, the French Revolution began to redefine the nature of political power."));
        products.add(new Product(3, "Knight Victory", 20000, "https://cdn.pixabay.com/photo/2019/02/14/07/28/painting-3995999__340.jpg"
                ,"Best painting ever", "Paul Rice portrait, painted in 1913 when he was 36, is a star exhibit in the National Portrait Gallery's new exhibition of her work. It usually hangs on an adjacent wall to James Guthrie's group portrait of the statesmen of the first world war; between them, these two paintings seem to launch the 20th-century galleries."));
        products.add(new Product(4, "The Monalisa", 15270, "https://cdn.pixabay.com/photo/2013/01/05/21/02/art-74050__340.jpg"
                ,"Best painting ever", "Mona Lisa oil painting on a poplar wood panel by Leonardo da Vinci, probably the world’s most famous painting. It was painted sometime between 1503 and 1519, when Leonardo was living in Florence, and it now hangs in the Louvre Museum, Paris, where it remained an object of pilgrimage in the 21st century."));



        adapter.setProducts(products);
    }
    public static ArrayList<Product> getAll(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Tableau", 10000, "https://cdn.pixabay.com/photo/2017/07/03/20/17/colorful-2468874__480.jpg"
                ,"Best painting ever", "Piet Mondrian painted his iconic Tableau I. After a period of time experimenting with his emerging new voice, Tableau I solidified what would become Mondrian’s defining style. The hard black lines and compartmentalized color fields offered viewers a glimpse of purified geometry and mathematical precision. The clean lines and precision of the work made no reference to anything other than form, color and line. The work ushered in a style that would influence generations of painters, sculptors, architects and designers, and continues to guide creative thinkers today."));
        products.add(new Product(2, "The Death of Socrates ", 3000, "https://cdn.pixabay.com/photo/2021/07/16/19/57/the-death-of-socrates-6471743__480.png"
                ,"Best painting ever", "The Death of Socrates is a neo-classical art piece painted by a French painter Jacques-Louis David in 1787. This painting portrayed the classical theme of the ‘trial and execution of Socrates’ with an underlying message of resistance against France’s unfair ruling authority during those times. Few years after this painting was drawn, the French Revolution began to redefine the nature of political power."));
        products.add(new Product(3, "Knight Victory", 20000, "https://cdn.pixabay.com/photo/2019/02/14/07/28/painting-3995999__340.jpg"
                ,"Best painting ever", "Paul Rice portrait, painted in 1913 when he was 36, is a star exhibit in the National Portrait Gallery's new exhibition of her work. It usually hangs on an adjacent wall to James Guthrie's group portrait of the statesmen of the first world war; between them, these two paintings seem to launch the 20th-century galleries."));
        products.add(new Product(4, "The Monalisa", 15270, "https://cdn.pixabay.com/photo/2013/01/05/21/02/art-74050__340.jpg"
                ,"Best painting ever", "Mona Lisa oil painting on a poplar wood panel by Leonardo da Vinci, probably the world’s most famous painting. It was painted sometime between 1503 and 1519, when Leonardo was living in Florence, and it now hangs in the Louvre Museum, Paris, where it remained an object of pilgrimage in the 21st century."));


        return products;
    }
}