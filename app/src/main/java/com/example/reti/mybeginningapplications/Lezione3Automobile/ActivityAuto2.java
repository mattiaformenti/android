package com.example.reti.mybeginningapplications.Lezione3Automobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.reti.mybeginningapplications.R;

/**
 * Created by reti on 08/04/2019.
 */

public class ActivityAuto2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_auto2);

        TextView tv2auto1 = (TextView) findViewById(R.id.tv2Auto1);
        TextView tv2auto2 = (TextView) findViewById(R.id.tv2Auto2);
        TextView tv2auto3 = (TextView) findViewById(R.id.tv2Auto3);

        Intent passaAuto = this.getIntent();
        Automobile auto = (Automobile) passaAuto.getSerializableExtra("auto");

        tv2auto1.setText(auto.colore);
        tv2auto2.setText(auto.marca);
        tv2auto3.setText(auto.modello);
    }
}
