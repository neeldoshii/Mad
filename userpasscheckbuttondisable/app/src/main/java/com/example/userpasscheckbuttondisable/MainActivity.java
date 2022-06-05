package com.example.userpasscheckbuttondisable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnStatus;
    TextView tvLoginStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnStatus = (Button) findViewById(R.id.button);
        tvLoginStatus = (TextView) findViewById(R.id.tvLoginStatus);
        etPassword.addTextChangedListener(TextChange);
        etUsername.addTextChangedListener(TextChange);
        check();
    }

            private TextWatcher TextChange=new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    check();
                }
            };
            public void check(){
            if(etUsername.getText().toString().equals("tonystark") && etPassword.getText().toString().equals("loveyou3000")){
                btnStatus.setEnabled(true);
                Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();;
            }else{
                btnStatus.setEnabled(false);
            }
        }
}
