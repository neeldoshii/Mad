package com.example.exp27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);


    }

    public void btntabbed(View view){
        if ((username.getText().toString().equals("admin")) && (password.getText().toString().equals("admin123"))){
            Toast toast = Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),"UnSuccess",Toast.LENGTH_SHORT);
            toast.show();

        }
    }

}