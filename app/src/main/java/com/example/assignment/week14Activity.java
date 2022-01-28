package com.example.assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class week14Activity extends Activity {
    Intent intent;
    Button btnStart, btnStop;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week14);
        setTitle("서비스 테스트 예제");

        intent = new Intent(this, MusicService.class);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(intent);
                android.util.Log.i("서비스 테스트", "startService()");
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(intent);
                android.util.Log.i("서비스 테스트", "stopService()");
            }
        });
    }
}

