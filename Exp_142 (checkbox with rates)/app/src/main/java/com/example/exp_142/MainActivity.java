package com.example.exp_142;

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

        button=findViewById(R.id.button);


    }


    public void btnclick(View view){
        int total=0;
        String s = " ";
//        s.append("Selected Items :- \n" );

        if(checkBox.isChecked()){
            total+= 150;
            s+= "Pizza: 150 \n";
//            s.append(checkBox.getText()+": 150 "+"\n");
        }
        if(checkBox2.isChecked()){
            s+= "Coffee: 200\n";
            total+= 200;

//            s.append(checkBox2.getText()+": 200"+"\n");
        }
        if(checkBox3.isChecked()){
            s+= "Burger: 500\n";
            total += 500;
//            s.append(checkBox3.getText()+": 500"+"\n");

        }
//        s.append(Integer.toString(total));
        Toast.makeText(getApplicationContext(),s + "\n Total: " + total,Toast.LENGTH_LONG).show();



    }

}