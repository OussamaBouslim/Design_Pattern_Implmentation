/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice5;

/**
 *
 * @author H-R
 */
public class VisiteurCalcul implements VisiteurArbre {

    private int resultat;

    public int getResultat() {
        return resultat;
    }

    @Override
    public void visiter(NoeudPlus noeudPlus) {
        noeudPlus.getGauche().accept(this);
        noeudPlus.getDroit().accept(this);
        resultat = getResultat() + getResultat();
    }

    @Override
    public void visiter(NoeudMoins noeudMoins) {
        noeudMoins.getGauche().accept(this);
        noeudMoins.getDroit().accept(this);
        resultat = getResultat() - getResultat();
    }

    @Override
    public void visiter(NoeudValeur noeudValeur) {
        resultat = noeudValeur.getValeur();
    }
}

