package com.javier.thirdapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG ="Main2Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<User> users = getIntent().getParcelableArrayListExtra("key");


        for(User user: users){
            Log.d(TAG, "onCreate: " + user);
        }
    }
}
