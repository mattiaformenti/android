package com.example.reti.mybeginningapplications.Prosegui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

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
        final CheckBox rb1 = (CheckBox) findViewById(R.id.rbProsegui1);
        final CheckBox rb2 = (CheckBox) findViewById(R.id.rbProsegui2);
        final CheckBox rb3 = (CheckBox) findViewById(R.id.rbProsegui3);

        final RadioButtonClass Rbc = new RadioButtonClass(rb1,rb2,rb3);
        ButtonClass Bc = new ButtonClass(BottoneProsegui);

        Rbc.addObserver(Bc);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.isChecked() && rb3.isChecked()) {
                    Rbc.setBottone();
                }
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked() && rb3.isChecked()) {
                    Rbc.setBottone();
                }
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.isChecked() && rb1.isChecked()) {
                    Rbc.setBottone();
                }
            }
        });
    }
}
