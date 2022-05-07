package com.example.exp21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private TextView mBatteryLevelText;
    private ProgressBar mBatteryLevelProgress;
    private BroadcastReceiver mReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBatteryLevelText = (TextView) findViewById(R.id.textView);
        mBatteryLevelProgress = (ProgressBar)findViewById(R.id.progressBar);
        mReceiver = new BatteryReceiver ();
    }
    @Override
    public void onStart() {
        registerReceiver(mReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }


    public class BatteryReceiver extends BroadcastReceiver {
        @Override
    public void onReceive(Context context, Intent intent){
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        mBatteryLevelText.setText("battery level "+level+"%");
        mBatteryLevelProgress.setProgress(level);
    }
    }
}