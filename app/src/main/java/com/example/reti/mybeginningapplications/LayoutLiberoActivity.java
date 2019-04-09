package com.example.reti.mybeginningapplications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by reti on 02/04/2019.
 */

public class LayoutLiberoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_libero);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button buttonYLW = (Button) findViewById(R.id.buttonYLW);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LayoutLiberoActivity.this, "Hai cliccato l'immagine", Toast.LENGTH_SHORT).show();
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LayoutLiberoActivity.this, "Hai cliccato il testo", Toast.LENGTH_SHORT).show();
            }
        });

        buttonYLW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LayoutLiberoActivity.this, "Hai cliccato il bottone giallo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
