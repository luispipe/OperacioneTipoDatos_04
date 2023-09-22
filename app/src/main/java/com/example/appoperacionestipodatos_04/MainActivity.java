package com.example.appoperacionestipodatos_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button operacionAscii= findViewById(R.id.buttonAscii);

        Intent viewAscii= new Intent(getApplicationContext(), AsciiActivity.class);

        operacionAscii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(viewAscii);
            }
        });

    }
}