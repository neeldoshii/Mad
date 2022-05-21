package com.example.mapsview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    //Initialize Varibale
    EditText etSource,etDestination;
    Button btTrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSource = findViewById(R.id.et_source);
        etDestination = findViewById(R.id.et_destination);
        btTrack = findViewById(R.id.bt_track);


        btTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get value form edit text
                String sSource = etSource.getText().toString().trim();
                String sDestination = etDestination.getText().toString().trim();

                //Check Condition
                if (sSource.equals("") && sDestination.equals("")){
                    Toast.makeText(getApplicationContext(),
                            "Enter both location",Toast.LENGTH_SHORT).show();
                }
                else if(sSource.equals(""))
                {
                    Toast.makeText(getApplicationContext(),
                            "Please enter the Start point",Toast.LENGTH_SHORT).show();
                }
                else if(sDestination.equals(""))
                {
                    Toast.makeText(getApplicationContext(),
                            "Please enter the Destination",Toast.LENGTH_SHORT).show();
                }
                else{
                    DisplayTrack(sSource,sDestination);
                }
            }
        });
    }

    private void DisplayTrack(String sSource, String sDestination) {
        try{
            Uri uri=Uri.parse("https://www.google.co.in/maps/dir/" + sSource + "/" + sDestination);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}