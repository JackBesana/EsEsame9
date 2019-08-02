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
public class ThGeneraCarattere extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThGeneraCarattere(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        
        for(int i=0;i<3;i++){
            System.out.print(datiC.generaCarattere());
        }
    }
}
