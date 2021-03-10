package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server based on the values in the back4app settings
        // clientKey is not needed unless explicitly configued
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this) // should correspond to APP_ID env variable
                .applicationId("6hy53xpI1ph8go5ejP6lwuDi0sJvhwzmP3pNS1gm") // set explicitly unless clientKey is explicit....
                .clientKey("qRzwWhuGyqoWDmfBb1ooJQLBb4v0nD9X6LiAZ0Ag")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
