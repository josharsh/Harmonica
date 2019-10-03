package com.example.android.harp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView T;
    EditText in;
    public final static String MESSAGE_KEY = "M";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T = findViewById(R.id.outputView);
        in = findViewById(R.id.inputView);
    }


    private String inpuFunc() {
        String N = String.valueOf(in.getText());
        return N;
    }

    public void pastFunc(View view) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData pasteData = clipboard.getPrimaryClip();
        ClipData.Item item = pasteData.getItemAt(0);

        String text = item.getText().toString();
        in.setText(text);

    }

    public void goFunc(View view) {

        String inputbyuser = inpuFunc();
        String input = inputbyuser.toUpperCase();
        String S = "SA";
        String Snote = "4";
        String R = "RE";
        String Rnote = "-4";
        String G = "GA";
        String Gnote = "5";
        String M = "MA";
        String P = "PA";
        String D = "DHA";
        String N = "NI";
        String S2 = "SA2";
        String Mnote = "-5";
        String Pnote = "6";
        String Dnote = "-6";
        String Nnote = "-7";
        String S2note = "7";

        String[] old = new String[8];
        String[] updated = new String[8];
        old[0] = "SA";
        old[1] = "RE";
        old[2] = "GA";
        old[3] = "MA";
        old[4] = "PA";
        old[5] = "DHA";
        old[6] = "NI";
        old[7] = "SA2";
        String[] new1 = new String[8];
        new1[0] = "4";
        new1[1] = "-4";
        new1[2] = "5";
        new1[3] = "-5";
        new1[4] = "6";
        new1[5] = "-6";
        new1[6] = "-7";
        new1[7] = "7";
        String temp = " ";
        String temp1 = "";
        String R1replaced = "";
        System.out.println("Sahi Chal Raha Hai");
        String R2replaced = "";
        String R3replaced = "";
        String R4replaced = "";
        String R5replaced = "";
        String R7replaced = "";
        String R6replaced = "";
        for (int i = 0; i < 1; ++i) {
            R1replaced = input.replaceAll(old[i], new1[i]);
            T.setText(" " + R1replaced);

            String temp11 = String.valueOf(T.getText());
            for (int j = 1; j < 2; ++j) {
                R2replaced = temp11.replaceAll(old[j], new1[j]);
                T.setText(R2replaced);
                System.out.println("HELLO");
            }

            String temp12 = String.valueOf(T.getText());
            for (int jk = 2; jk < 3; ++jk) {
                R3replaced = temp12.replaceAll(old[jk], new1[jk]);
                T.setText(R3replaced);
                System.out.println("HELLO1");
            }

            String temp13 = String.valueOf(T.getText());
            for (int jkk = 3; jkk < 4; ++jkk) {
                R4replaced = temp13.replaceAll(old[jkk], new1[jkk]);
                T.setText(R4replaced);
                System.out.println("HELLO2");
            }

            String temp14 = String.valueOf(T.getText());
            for (int jkkk = 4; jkkk < 5; ++jkkk) {
                R5replaced = temp14.replaceAll(old[jkkk], new1[jkkk]);
                T.setText(R5replaced);
            }

            String temp15 = String.valueOf(T.getText());
            for (int jkkkk = 5; jkkkk < 6; ++jkkkk) {
                R6replaced = temp15.replaceAll(old[jkkkk], new1[jkkkk]);
                T.setText(R6replaced);
            }

            String temp16 = String.valueOf(T.getText());
            for (int jkkkkk = 6; jkkkkk < 7; ++jkkkkk) {
                R7replaced = temp16.replaceAll(old[jkkkkk], new1[jkkkkk]);
                T.setText(R7replaced);
                T.setVisibility(View.GONE);

            }
            String Final = String.valueOf(T.getText());
            Intent intent = new Intent(view.getContext(), HarpActivity.class);
            intent.putExtra(MESSAGE_KEY, Final);
            startActivity(intent);

        }

    }

}

