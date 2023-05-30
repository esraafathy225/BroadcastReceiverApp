package com.app.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isEnabled=intent.getBooleanExtra("state",false);

        if(isEnabled){
            Toast.makeText(context,"Airplane Mode Enabled",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context,"Airplane Mode Disabled",Toast.LENGTH_SHORT).show();
        }
    }
}
