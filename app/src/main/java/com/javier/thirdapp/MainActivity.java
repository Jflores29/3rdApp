package com.javier.thirdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    public ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (EditText) findViewById(R.id.firstname);
        lastName = (EditText) findViewById(R.id.lastname);

        users= new ArrayList<>();
    }
//create Array list
    public void createArray(View view) {
        String str = firstName.getText().toString();
        String str2 = lastName.getText().toString();

//        ArrayList<String> users = new ArrayList<String>();
        User user = new User(str,str2);

        users.add(user);



    }

// send array to second activity
    public void gotosecond(View view) {

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("key", users);
        startActivityForResult(intent, 5);

    }
}
