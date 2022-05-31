package com.example.exp_132;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.content.Context;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    ProgressDialog pd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void dialog(View view) {
        Context context;
        pd1 = new ProgressDialog(MainActivity.this);
        pd1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd1.setTitle("Progress Working");
        pd1.setMessage("File downloading....");
        pd1.show();
        pd1.setProgress(80);
    }
}