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
public class NoeudMoins implements Noeud {
    private Noeud gauche;
    private Noeud droit;

    public NoeudMoins(Noeud gauche, Noeud droit) {
        this.gauche = gauche;
        this.droit = droit;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }

    @Override
    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}

