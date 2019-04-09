package com.example.reti.mybeginningapplications.Lezione3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.reti.mybeginningapplications.R;

/**
 * Created by reti on 05/04/2019.
 */

public class NuovaActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lezione_tre_bottone);

        final Button btnLez3btn2 = (Button) findViewById(R.id.buttonLayoutLez3Btn2);

        Intent cambiaSfondo = this.getIntent();
        int temp = cambiaSfondo.getExtras().getInt("colore");
        btnLez3btn2.setBackgroundResource(temp);
        int temp2 = cambiaSfondo.getExtras().getInt("stringa");
        String pippo = getResources().getString(temp2);
        Toast.makeText(this, "Hai selezionato il colore "+pippo,Toast.LENGTH_SHORT).show();

        btnLez3btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tornaHome = new Intent(NuovaActivity2.this, NuovaActivity.class);
                Toast.makeText(NuovaActivity2.this, "Sei tornato alla home",Toast.LENGTH_SHORT).show();
                startActivity(tornaHome);
            }
        });
    }
}
