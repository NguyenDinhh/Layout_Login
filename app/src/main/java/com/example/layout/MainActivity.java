package com.example.layout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.*;
import android.view.View.OnClickListener;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private String username;
    private String password;
    private Button btn;
    private EditText username_input;
    private EditText password_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button_login);
        btn.setOnClickListener(this);
        password_input = findViewById(R.id.password_input);
        username_input = findViewById(R.id.username_input);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {
        username = username_input.getText().toString();
        password =  password_input.getText().toString();
        Log.i("dinhk4","Username: " +username+ " and Password : "+password);
    }
}