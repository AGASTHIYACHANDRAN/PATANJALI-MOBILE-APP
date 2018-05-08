package com.example.layout.login;

/**
 * Created by MEENU SAKHANA S on 07-05-2018.
 */

import android.widget.EditText;

import android.widget.EditText;

public class Login_details {
    private String Id;
    private String Name;
    private String Pass;
    private String Cpass;
    private String Email;
    private String Phno;

    public Login_details(String Id, String Name, EditText Pass, EditText Cpass, EditText Email, EditText Phno)
    {
        //required
    }

    public Login_details( String Id,String Name,String Pass, String Cpass,String Email,String Phno)
    {
        this.Id=Id;
        this.Name=Name;
        this.Pass=Pass;
        this.Cpass=Cpass;
        this.Email=Email;
        this.Phno=Phno;
    }

    public String  getId() { return Id;}
    public String getName() {return Name;}
    public String getPass() {return Pass;}
    public String getCpass() {return Cpass;}
    public String getEmail() {return Email;}
    public String getPhno() {return Phno;}
}

