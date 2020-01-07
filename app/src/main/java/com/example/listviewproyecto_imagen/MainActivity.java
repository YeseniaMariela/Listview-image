package com.example.listviewproyecto_imagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.listviewproyecto_imagen.Adapter.ProductAdapter;
import com.example.listviewproyecto_imagen.helpers.QueueUtils;
import com.example.listviewproyecto_imagen.models.products;

public class MainActivity extends AppCompatActivity {
    ProductAdapter productAdapter;
    QueueUtils.QueueObject queue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queue = QueueUtils.getInstance(this.getApplicationContext());

        productAdapter =
                new ProductAdapter(this,
                        products.getData(),
                        queue.getImageLoader());
    }
}
