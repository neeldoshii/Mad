package com.example.exp91;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView TV;
    ToggleButton tgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV = findViewById(R.id.TV);
        tgbtn = findViewById(R.id.tgbtn);

    }

    public void btnClick(View view){

        TV.setText(tgbtn.getText());


    }
}