package com.example.week2prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TITLE= "Main Activity";
    User myUser;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE,"On create:");
        myUser = new User("mickey","hello world",120,false);
        myButton=findViewById(R.id.button);
        if (myUser.followed)
        {
            myButton.setText("Unfollow");
        }
        else
        {
            myButton.setText("Follow");
        }


    }



    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE,"On start:");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE,"On pause:");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "On resume:");
        myButton=findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myUser.followed)
                {
                    myUser.followed = false;
                    myButton.setText("Follow");
                    Log.v(TITLE, "Follow");
                }
                else
                {
                    myUser.followed=true;
                    myButton.setText("Unfollow");
                    Log.v(TITLE, "Unfollow");
                }





            }
        });
        Button myButton2 = findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TITLE, "Description");


            }
        });

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "On stop:");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE,"On destroy");
    }


}