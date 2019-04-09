package com.example.reti.mybeginningapplications.Lezione3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.reti.mybeginningapplications.R;

/**
 * Created by reti on 04/04/2019.
 */

public class NuovaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lezione_tre);

        Button btnLez3btn1 = (Button) findViewById(R.id.buttonLayoutLez3Btn1);
        final RadioGroup rdGrp = (RadioGroup) findViewById(R.id.radioGRP);

        btnLez3btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiaSfondo = new Intent(NuovaActivity.this, NuovaActivity2.class);
                switch (rdGrp.getCheckedRadioButtonId()) {
                    case R.id.radioButton:
                        cambiaSfondo.putExtra("colore", R.color.colorPrimaryDark);
                        cambiaSfondo.putExtra("stringa",R.string.rdbBlue);
                        break;
                    case R.id.radioButton2:
                        cambiaSfondo.putExtra("colore", R.color.colorAccent);
                        cambiaSfondo.putExtra("stringa",R.string.rdbRosso);
                        break;
                    case R.id.radioButton3:
                        cambiaSfondo.putExtra("colore", R.color.colorYellow);
                        cambiaSfondo.putExtra("stringa",R.string.rdbYellow);
                        break;
                    default:
                        break;
                }
                startActivity(cambiaSfondo);
            }
        });

        Intent tornaHome = this.getIntent();
    }
}

