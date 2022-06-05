package com.example.changeimage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView imgview;
    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgview.findViewById(R.id.imgview);
        btn.findViewById(R.id.btn);


    }


    public void btntapped(View view) {
        imgview.setImageResource(R.drawable.image1);

    }
}