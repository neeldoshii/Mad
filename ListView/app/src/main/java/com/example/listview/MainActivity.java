package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener {
    ListView l1;
    String[] course={"MAD","PWP","WBP","ETI","MGT","EDP",};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView)findViewById(R.id.listv);
        ArrayAdapter <String> coursead = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,course);
        l1.setAdapter(coursead);
        l1.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
    String s1;
    s1=String.valueOf(adapterView.getItemAtPosition(i));
    Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
    }
}
