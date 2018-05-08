package com.example.layout.login;

/**
 * Created by MEENU SAKHANA S on 07-05-2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class Product extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);
        b1 = (Button)findViewById(R.id.fw1);

       // TextView imgv = findViewById(R.id.fw1);
      /*  b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Product.this, Signup.class);
                startActivity(i);
            }
        });*/

    }

    public void face(View v)
    {
        Intent i = new Intent(this, Facewash.class);
        startActivity(i);
    }
}

