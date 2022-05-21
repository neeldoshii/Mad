package com.example.sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText to, sub, msg;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to = findViewById(R.id.to);
        sub = findViewById(R.id.sub);
        msg = findViewById(R.id.msg);
        btnsend = findViewById(R.id.btnsend);

    }

    public void btnsend(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,new String[] {to.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,msg.getText().toString());
        intent.setType("message/rfc822");
startActivity(Intent.createChooser(intent,"choose mail app "));
    }
}