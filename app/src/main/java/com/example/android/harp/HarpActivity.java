package com.example.android.harp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class HarpActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY ="M";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_harp);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
       // Log.v("H0000higgggggg",message);
        TextView Vi=(TextView)findViewById(R.id.outputSecondView);
        if(message!=""){
            Toast.makeText(this,"HELLO", Toast.LENGTH_SHORT);}
        Vi.setText(message);

    }
}
