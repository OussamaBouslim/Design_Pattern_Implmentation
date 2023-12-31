/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice5_Visitor;

/**
 *
 * @author H-R
 */
public class NoeudValeur implements Noeud {
    private int valeur;

    public NoeudValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    
    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}