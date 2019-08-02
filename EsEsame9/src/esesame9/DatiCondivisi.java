/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame9;

import java.util.Random;

/**
 *
 * @author besan
 */
public class DatiCondivisi {

    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    char carattere;
    char carattere2;
    char carattere3;
    int numero = 0;

    public char generaCarattere() {
        Random r = new Random();
        carattere = alfabeto.charAt(r.nextInt(alfabeto.length()));
        return carattere;
     }

    public int generaNumero() {
        Random r = new Random();
        numero = r.nextInt(10);
        return numero;
    }
}
