package com.example.assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button week9 = (Button) findViewById(R.id.week9);
        week9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), week9Activity.class);
                startActivity(intent);
            }

        });
        Button week10 = (Button) findViewById(R.id.week10);
        week10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), week10Activity.class);
                startActivity(intent);
            }

        });
        Button week11 = (Button) findViewById(R.id.week11);
        week11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), week11Activity.class);
                startActivity(intent);
            }

        });
        Button week12 = (Button) findViewById(R.id.week12);
        week12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), week12Activity.class);
                startActivity(intent);
            }

        });
        Button week13 = (Button) findViewById(R.id.week13);
        week13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), week13Activity.class);
                startActivity(intent);
            }

        });
        Button week14 = (Button) findViewById(R.id.week14);
        week14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), week14Activity.class);
                startActivity(intent);
            }

        });


    }
}
