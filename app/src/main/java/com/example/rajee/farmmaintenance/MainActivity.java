package com.example.rajee.farmmaintenance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static boolean isFanOn = false;
    public static boolean isSprinklerOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button btn_fan = (Button) findViewById(R.id.fan_on);
        btn_fan.setText(isFanOn?"Fan is ON":"Fan is OFF");
        Button btn_sprinkler = (Button) findViewById(R.id.sprinkler_on);
        btn_sprinkler.setText(isSprinklerOn?"Sprinkler is ON":"Sprinkler is OFF");
    }
}
