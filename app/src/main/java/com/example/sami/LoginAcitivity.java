package com.example.sami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acitivity);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton)  findViewById(R.id.loginbtn);

        //adming and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
                    //Mensaje Correcto
                    Toast.makeText(LoginAcitivity.this,"LOGIN CORRECTO",Toast.LENGTH_SHORT).show();
                }else {
                    //Mensaje Incorrecto
                    Toast.makeText(LoginAcitivity.this,"LOGIN INCORRECTO",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}