package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateText(View myView){
        TextView starting = (TextView) findViewById(R.id.textView);
        EditText updated = (EditText) findViewById(R.id.editText);
        starting.setText(updated.getText().toString());
    }
}
