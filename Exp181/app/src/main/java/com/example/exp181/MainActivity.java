package com.example.exp181;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText)findViewById(R.id.urlText);
        Button btn = (Button) findViewById(R.id.btnNavigate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String url = "tel:"+editText.getText().toString();
               //String url = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
                //FOR OPENNING WEB PAGE
                // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                startActivity(intent);
            }
        });
    }
}