package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("E4A3pkgtk9FQJDg24kENSkcOlRl4iNf1Fn38SnJI")
                .clientKey("3VGa0HIkqgQ3qCpKwpMMQU5hc0BhMoCxPdZ3Twqz")
                .server("https://parseapi.back4app.com")
                .build()


        );
    }
}
