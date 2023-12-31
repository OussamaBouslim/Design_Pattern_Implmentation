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
public class CompteBancaire {

    private int numero;
    private double solde;
    private Journalisation journalisation;

    public CompteBancaire(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        this.journalisation = Journalisation.getInstance();
    }

    public void deposerArgent(double montant) {
        solde += montant;
        journalisation.ajouterLog("Dépôt sur le compte " + numero + " : " + montant + " DA");
    }

    public void retirerArgent(double montant) {
        if (montant <= solde) {
            solde -= montant;
            journalisation.ajouterLog("Retrait sur le compte " + numero + " : " + montant + " DA");
        } else {
            journalisation.ajouterLog("Solde insuffisant pour le retrait sur le compte " + numero);
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }
}
