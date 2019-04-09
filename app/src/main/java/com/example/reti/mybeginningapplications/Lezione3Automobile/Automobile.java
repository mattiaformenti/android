package com.example.reti.mybeginningapplications.Lezione3Automobile;

import java.io.Serializable;

/**
 * Created by reti on 08/04/2019.
 */

public class Automobile implements Serializable{

    String marca, colore, modello;

    public Automobile(String marca, String colore, String modello) {
        this.marca = marca;
        this.colore = colore;
        this.modello = modello;
    }

}
