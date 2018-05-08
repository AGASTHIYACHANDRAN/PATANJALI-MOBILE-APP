package com.example.layout.login;

/**
 * Created by MEENU SAKHANA S on 07-05-2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {
    EditText editTextName;
    EditText editTextPass;
    EditText editTextCpass;
    EditText editTextEmail;
    EditText editTextPhno;
    Button buttonReg;

    DatabaseReference databaseArtists;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        //Button btn =

        databaseArtists= FirebaseDatabase.getInstance().getReference("artists");


        editTextName = (EditText) findViewById(R.id.name);
        editTextPass=(EditText)findViewById(R.id.pass);
        editTextCpass=(EditText)findViewById(R.id.Confirm);
        editTextEmail=(EditText)findViewById(R.id.email);
        editTextPhno=(EditText)findViewById(R.id.phno);
        buttonReg=(Button)findViewById(R.id.regbtn);

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i1);
                addArtist();
            }
        });
    }
    private void addArtist()
    {
        String Name = editTextName.getText().toString().trim();
        String Pass = editTextPass.getText().toString().trim();
        String Cpass = editTextCpass.getText().toString().trim();
        String Email= editTextEmail.getText().toString().trim();
        String Phno= editTextPhno.getText().toString().trim();

        if(!TextUtils.isEmpty(Name))
        {
            String id = databaseArtists.push().getKey();
            Login_details login_details = new Login_details(id ,Name , Pass , Cpass , Email , Phno);
            databaseArtists.child(id).setValue(login_details);

            Toast.makeText(this, "Artist added", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "You Should enter a name", Toast.LENGTH_LONG).show();
        }
    }
}
