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
public class VisiteurAffichage implements VisiteurArbre {

    @Override
    public void visiter(NoeudPlus noeudPlus) {
        System.out.print("+ ");
        noeudPlus.accept(this);
    }

    @Override
    public void visiter(NoeudMoins noeudMoins) {
        System.out.print("- ");
        noeudMoins.accept(this);
    }

    @Override
    public void visiter(NoeudValeur noeudValeur) {
        System.out.print(noeudValeur.getValeur() + " ");
    }
}
