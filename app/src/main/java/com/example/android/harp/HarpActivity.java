package com.example.android.harp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HarpActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY = "M";

    public void goBackActivity(View view){
        finish();
    }

    public void copyToClipboard(View view){
        TextView TV = findViewById(R.id.outputSecondView);
        CharSequence output = TV.getText();
        if (output == null){
            return;
        }
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Numeric harmonica notation", output);
        clipboard.setPrimaryClip(clip);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_harp);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        // Log.v("H0000higgggggg",message);
        TextView Vi = findViewById(R.id.outputSecondView);
        if (!message.equals("")) {
            Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
        }
        Vi.setText(message);

    }
}
