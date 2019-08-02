/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame9;

/**
 *
 * @author besan
 */
public class ThGeneraNumero extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThGeneraNumero(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        System.out.print(datiC.generaNumero());
    }
}