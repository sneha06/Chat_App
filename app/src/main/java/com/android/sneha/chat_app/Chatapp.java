package com.android.sneha.chat_app;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by sneha on 25/2/15.
 */
public class Chatapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "YGMLd2APV7tCt4YjAnwQts7nKIqL1JKYu4Q49Bbv", "WJAAkd6AwcKxS6HDPUojkgDu6LPvO5GL4C9Z5Ni2");

    }
}
