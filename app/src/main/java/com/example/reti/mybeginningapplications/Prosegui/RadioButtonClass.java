package com.example.reti.mybeginningapplications.Prosegui;

import android.widget.CheckBox;

import java.util.LinkedList;
import java.util.Observable;

/**
 * Created by reti on 11/04/2019.
 */

public class RadioButtonClass extends Observable {

    private LinkedList <CheckBox> rbGruppo = new LinkedList<>();

    public RadioButtonClass(CheckBox r1, CheckBox r2, CheckBox r3){
        rbGruppo.add(r1);
        rbGruppo.add(r2);
        rbGruppo.add(r3);
    }

    public void setBottone(){
        setChanged();
        notifyObservers();
    }
}
