package com.home.currency;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ntd;
    EditText jp;
    EditText us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ntd = findViewById (R.id.ntd);
    }

    public void currency(View view) {

        String input = ntd.getText ().toString ();

        if(input.isEmpty ()) {
            new AlertDialog.Builder (this)
                    .setTitle ("Problem")
                    .setMessage ("Please enter NTD amount")
                    .setPositiveButton ("OK", null)
                    .show ();
        } else {
            float usd = Float.parseFloat (input);
            usd /= 30.9;
            new AlertDialog.Builder (this)
                    .setTitle ("Result")
                    .setMessage ("USD is  " + usd)
                    .setPositiveButton ("OK", null)
                    .show ();
        }

    }
}