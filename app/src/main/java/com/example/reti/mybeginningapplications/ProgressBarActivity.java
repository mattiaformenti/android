package com.example.reti.mybeginningapplications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by reti on 29/03/2019.
 */

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar_layout);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        final Button myPBarButton = (Button) findViewById(R.id.buttonPBar);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        myPBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAsyncTask task = new MyAsyncTask(getApplicationContext(), progressBar, myPBarButton);
                task.execute(5);
            }
        });

    }
}
