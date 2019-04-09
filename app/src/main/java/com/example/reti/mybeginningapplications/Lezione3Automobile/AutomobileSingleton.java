package com.example.reti.mybeginningapplications.Lezione3Automobile;

/**
 * Created by reti on 08/04/2019.
 */

public class AutomobileSingleton {

    private static Automobile instance = null;

    private AutomobileSingleton(){

    }

    public static Automobile getInstance(Automobile auto){
        if(instance == null){
            instance = new Automobile(auto.marca, auto.colore, auto.modello);
        }
        return instance;
    }
}
