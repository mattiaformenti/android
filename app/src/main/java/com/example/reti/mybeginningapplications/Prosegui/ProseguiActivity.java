package com.example.reti.mybeginningapplications.Prosegui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.reti.mybeginningapplications.R;

/**
 * Created by reti on 08/04/2019.
 */

public class ProseguiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_prosegui_button);

        Button BottoneProsegui = (Button) findViewById(R.id.buttonProsegui);

    }
}
