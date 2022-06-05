package com.example.exp_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox,checkBox2,checkBox3,checkBox4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        checkBox4=findViewById(R.id.checkBox4);

        button=findViewById(R.id.button);


    }


    public void btnclick(View view){
        StringBuilder s = new StringBuilder();
        s.append("hello");

        if(checkBox.isChecked()){
            s.append("I am checkbox");
        }
        if(checkBox2.isChecked()){
            s.append("I am checkbox2");
        }
        if(checkBox3.isChecked()){
            s.append("I am checkbox3");
        }
        if(checkBox4.isChecked()){
            s.append("I am checkbox4");
        }
        Toast toast=Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG);
        toast.show();



    }

}