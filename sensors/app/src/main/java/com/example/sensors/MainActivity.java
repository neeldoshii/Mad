package com.example.sensors;

import android.app.Activity;
import android.graphics.*;
import android.hardware.*;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
    SensorManager sensorManager;
    boolean isColor = false;
    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.textView);
        view.setBackgroundColor(Color.GREEN);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {}
    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAccelerometer(event);
        }
    }
    private void getAccelerometer(SensorEvent event) {
        float[] values = event.values;
        float x = values[0];
        float y = values[1];
        float z = values[2];
        float accelationSquareRoot = (x * x + y * y + z * z)/(SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
        if (accelationSquareRoot >= 2)
        {


            if (isColor) {
                view.setBackgroundColor(Color.GREEN);

            } else {
                view.setBackgroundColor(Color.RED);
            }
            isColor = !isColor;
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
    }
    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }
}
