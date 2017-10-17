package com.example.wail.testimplicit01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Appel = (Button) findViewById(R.id.button1);
        Appel.setOnClickListener(this);
        //final String APPEL = "Appel";
        Button mms = (Button) findViewById(R.id.button2);
        mms.setOnClickListener(this);
        //final String MMS = "MMS";
        Button sms = (Button) findViewById(R.id.button3);
        sms.setOnClickListener(this);
        //final String SMS = "SMS";
        Button web = (Button) findViewById(R.id.button4);
        web.setOnClickListener(this);
        //final String WEB = "WEB";
        Button map = (Button) findViewById(R.id.button5);
        map.setOnClickListener(this);
        //final String MAP = "MAP";
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                Log.i("MyApp", " APPEL");
                break;
            case R.id.button2:
                Log.i("MyApp2", "MMS");
                break;
            case R.id.button3:
                Log.i("MyApp3", " SMS");
                break;
            case R.id.button4:
                Log.i("MyApp4", " WEB");
                break;
            case R.id.button5:
                Log.i("MyApp5", " MAP");
                break;
        }
    }
    
}


