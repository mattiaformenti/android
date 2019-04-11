package com.example.reti.mybeginningapplications.Prosegui;

import android.widget.Button;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by reti on 11/04/2019.
 */

public class ButtonClass implements Observer {

    private Button BtClick = null;

    public ButtonClass(Button BtClick){
        this.BtClick = BtClick;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(BtClick.isEnabled()) {
            BtClick.setEnabled(false);
        }else{
            BtClick.setEnabled(true);
        }
    }
}
