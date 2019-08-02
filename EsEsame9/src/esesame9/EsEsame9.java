/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class EsEsame9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DatiCondivisi datiC = new DatiCondivisi();

            ThGeneraCarattere th1 = new ThGeneraCarattere(datiC);
            ThGeneraNumero th2 = new ThGeneraNumero(datiC);

            th1.start();
            th2.start();

            th1.join();
            th2.join();
        
        } catch (InterruptedException ex) {
            Logger.getLogger(EsEsame9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
