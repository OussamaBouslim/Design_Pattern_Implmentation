/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice4_singleton;

/**
 *
 * @author H-R
 */
public class Main {

    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(123, 0);
        CompteBancaire compte2 = new CompteBancaire(321, 0);

        compte1.deposerArgent(100);
        compte1.retirerArgent(80);

        compte2.deposerArgent(200);
        compte2.retirerArgent(110);

        Journalisation journal = Journalisation.getInstance();
        System.out.println("Journaux de log :\n" + journal.getLogs());
    }
}
