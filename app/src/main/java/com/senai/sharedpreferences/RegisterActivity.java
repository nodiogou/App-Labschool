package com.senai.sharedpreferences;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    private EditText inputEmail,inputPass,inputName;
    private Button btnRegister, btnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        inputEmail = findViewById(R.id.email2);
        inputName = findViewById(R.id.nome2);
        inputPass = findViewById(R.id.senha2);
        btnRegister = findViewById(R.id.register);
        btnLogin = findViewById(R.id.login2);






    }
}