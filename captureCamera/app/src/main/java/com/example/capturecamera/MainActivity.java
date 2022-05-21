package com.example.capturecamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;

import android.content.*;
import android.graphics.*;
import android.provider.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // Define the pic id
     int pic_id = 123;

    // Define the button and imageview type variable
    Button camera_button;
    ImageView click_image;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // By ID we can get each component
        // which id is assigned in XML file
        // get Buttons and imageview.
        camera_button = findViewById(R.id.camera_button);
        click_image = findViewById(R.id.click_image);

        // Camera_open button is for open the camera
        // and add the setOnClickListener in this button


    }

    public void btnTapped(View view) {

        // Create the camera_intent ACTION_IMAGE_CAPTURE
        // it will open the camera for capture the image
        Intent intent
                = new Intent(MediaStore
                .ACTION_IMAGE_CAPTURE);

        // Start the activity with camera_intent,
        // and request pic id
        startActivityForResult(intent, pic_id);
    }

    // This method will help to retrieve the image
    public void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {

        // Match the request 'pic id with requestCode

        if (requestCode == pic_id) {

            // BitMap is data structure of image file
            // which stor the image in memory
            Bitmap photo = (Bitmap) data.getExtras()
                    .get("data");

            // Set the image in imageview for display
            click_image.setImageBitmap(photo);
        }
    }



}