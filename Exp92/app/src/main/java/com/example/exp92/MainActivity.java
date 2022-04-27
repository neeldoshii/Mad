package com.example.exp92;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fnum;
    EditText snum;
    Button addBtn;
    Button subBtn;
    Button mulBtn;
    Button divBtn;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnum = findViewById(R.id.fnum);
        snum = findViewById(R.id.snum);
        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);
        ans = findViewById(R.id.ans);

    }

    public void subtraction(View view) {
        Double fnum1 = Double.valueOf(fnum.getText().toString());
        Double fnum2 = Double.valueOf(snum.getText().toString());
        Double sub = fnum1 - fnum2;
        ans.setText(Double.toString(sub));

    }

    public void addition(View view) {
        Double fnum1 = Double.valueOf(fnum.getText().toString());
        Double fnum2 = Double.valueOf(snum.getText().toString());
        Double add = fnum1 + fnum2;
        ans.setText(Double.toString(add));
    }

    public void multiplication(View view) {
        Double fnum1 = Double.valueOf(fnum.getText().toString());
        Double fnum2 = Double.valueOf(snum.getText().toString());
        Double mul = fnum1 * fnum2;
        ans.setText(Double.toString(mul));
    }

    public void Division(View view) {
        Double fnum1 = Double.valueOf(fnum.getText().toString());
        Double fnum2 = Double.valueOf(snum.getText().toString());
        Double div = fnum1 / fnum2;
        ans.setText(Double.toString(div));
    }


}