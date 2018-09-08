package com.ibaez.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Spinner extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private Spinner abmListView = null;
    private String[] abm = {
                "BSIT",
                "BSCS",
                "BSCpE",
                "MSIT",
                "MSCS",

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
    }
}
