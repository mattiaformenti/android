package com.example.reti.mybeginningapplications.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.reti.mybeginningapplications.R;

/**
 * Created by reti on 11/04/2019.
 */

public class FragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_Activity_fragment);

        Button btnActFrag = (Button) findViewById(R.id.buttonAF);
    }
}
