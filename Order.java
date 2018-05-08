package com.example.layout.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by MEENU SAKHANA S on 07-05-2018.
 */

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        Button btn = (Button)findViewById(R.id.regbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Order.this,"Your order has been placed",Toast.LENGTH_LONG).show();
            }
        });
    }
}

