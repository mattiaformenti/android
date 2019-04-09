package com.example.reti.mybeginningapplications.Lezione3Automobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.reti.mybeginningapplications.R;

/**
 * Created by reti on 08/04/2019.
 */

public class ActivityAuto1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_auto1);

        Button buttonAuto1 = (Button) findViewById(R.id.buttonAuto1);
        final TextView coloreAuto = (TextView) findViewById(R.id.tv1Auto1);
        final TextView marcaAuto = (TextView) findViewById(R.id.tv1Auto2);
        final TextView modelloAuto = (TextView) findViewById(R.id.tv1Auto3);

        buttonAuto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passaAuto = new Intent(ActivityAuto1.this, ActivityAuto2.class);
                String testo1 = coloreAuto.getText().toString();
                String testo2 = marcaAuto.getText().toString();
                String testo3 = modelloAuto.getText().toString();
                Automobile auto = new Automobile(testo1,testo2,testo3);
                passaAuto.putExtra("auto", AutomobileSingleton.getInstance(auto));
                startActivity(passaAuto);
            }
        });
    }
}
