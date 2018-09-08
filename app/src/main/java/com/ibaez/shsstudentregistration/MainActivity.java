package com.ibaez.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button button;
    private String[] Course = {
            "BSIT",
            "BSCS",
            "BSCpE",
            "MSIT",
            "MSCS",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            getSupportActionBar()setTitle("Execute Spinner");
            ArrayList<String> courseData ;


    }
}
