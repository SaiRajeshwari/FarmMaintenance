package com.example.rajee.farmmaintenance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class FanReceiver extends BroadcastReceiver {
    public FanReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity.isFanOn = Boolean.parseBoolean(intent.getStringExtra("fan"));
        MainActivity.isSprinklerOn = Boolean.parseBoolean(intent.getStringExtra("sprinkler"));
    }
}
