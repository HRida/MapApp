package com.example.hrida.mapapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sub;
    private EditText edLat, edLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sub = (Button)findViewById(R.id.submit);
        edLat = (EditText)findViewById(R.id.tlat);
        edLong = (EditText)findViewById(R.id.tlong);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edLat.getText().toString().equals("") || edLong.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                }else {
                    Intent il = new Intent(MainActivity.this, MapsActivity.class);
                    Locations.latitute = Double.parseDouble(edLat.getText().toString());
                    Locations.longitute = Double.parseDouble(edLong.getText().toString());
                    startActivity(il);
                }
            }
        });
    }
}
