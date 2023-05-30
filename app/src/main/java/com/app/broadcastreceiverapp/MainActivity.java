package com.app.broadcastreceiverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AirplaneModeReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        receiver=new AirplaneModeReceiver();

        registerReceiver(receiver, filter, Manifest.permission.BLUETOOTH_CONNECT, null );

    }


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(receiver);
    }
}