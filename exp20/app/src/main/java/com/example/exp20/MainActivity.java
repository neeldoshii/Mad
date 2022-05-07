package com.example.exp20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);







        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(true);

                Toast t1=Toast.makeText(getApplicationContext(),"Wifi enabled",Toast.LENGTH_SHORT);
                t1.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Wifi enabled",Toast.LENGTH_SHORT);

            }
        });



    }



////
////
//////
//    public void start(View view) {
//        WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
//        wifi.setWifiEnabled(true);
//        Toast b1=Toast.makeText(getApplicationContext(),"Wifi enabled",Toast.LENGTH_SHORT);
//    }
//////
//    public void stop(View view) {
//        WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
////        wifi.setWifiEnabled(false);
//        Toast t1=Toast.makeText(getApplicationContext(),"Wifi dinabled",Toast.LENGTH_SHORT);
//
//
//    }
//
}