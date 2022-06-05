package com.example.autocomplete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
public class MainActivity extends Activity {
    AutoCompleteTextView autocomplete;
    String[] arr = {"MAD", "PWP", "WBP", "MANAGEMENT", "EDP", "ETI"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autocomplete = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, arr);
        autocomplete.setThreshold(1);
        autocomplete.setAdapter(adapter);
    }
}