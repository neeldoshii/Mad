package com.example.sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget. *;

public class MainActivity extends AppCompatActivity {
    EditText txtTo, txtSub, txtMsg;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTo = findViewById(R.id.txtTo);
        txtSub = findViewById(R.id.txtSub);
        txtMsg = findViewById(R.id.txtMsg);
        btnsend = findViewById(R.id.btnsend);

    }

    public void btnsend(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,new String[] {txtTo.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT,txtSub.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,txtMsg.getText().toString());
        intent.setType("message/rfc822");
startActivity(Intent.createChooser(intent,"choose mail app "));
    }
}