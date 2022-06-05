package com.example.radiobtn;

import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {  Button b1;
    RadioButton r1,r2,r3,r4;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  b1=findViewById(R.id.b1);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
    }
    public void select(View view) {
        s="";
        if(r1.isChecked())
        {
            s=s+" "+r1.getText().toString();
        }
        if(r2.isChecked())
        {
            s=s+" "+r2.getText().toString();
        }
        if(r3.isChecked())
        {
            s=s+" "+r3.getText().toString();
        }
        if(r4.isChecked())
        {
            s=s+" "+r4.getText().toString();
        }
        s="Radio Buttons selected "+" \n "+s;
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();  }
}
