package com.android.sneha.chat_app;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by sneha on 24/2/15.
 */
public class Receiver extends ParsePushBroadcastReceiver {

    private static final String TAG = "MyCustomReceiver";



    public void onPushOpen(Context context, Intent intent) {

        Toast.makeText(context,"on push open",Toast.LENGTH_LONG);
        Log.e("Push", "Clicked");
        Intent i = new Intent(context, ChatActivity.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);




 }
}


