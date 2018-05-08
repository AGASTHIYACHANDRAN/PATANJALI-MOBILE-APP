package com.example.layout.login;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

   // private FirebaseAuth mAuth;
    RelativeLayout relay1, relay2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            relay1.setVisibility(View.VISIBLE);
            relay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {


      //  mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relay1 = (RelativeLayout) findViewById(R.id.relay1);
        relay2 = (RelativeLayout) findViewById(R.id.relay2);
        handler.postDelayed(runnable, 2000);


        Button b1 = (Button) findViewById(R.id.b1);
        Button b2=(Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Product.class);
                startActivity(i);
            }
        });
    }
}
