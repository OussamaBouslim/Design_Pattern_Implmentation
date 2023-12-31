/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice7_State;

/**
 *
 * @author H-R
 */
public abstract class EtatCommande
{
        protected Commande commande;
        public EtatCommande(Commande commande)
        {
            this.commande = commande;
        }
        
    public abstract void ajouteProduit(Produit produit);
    public abstract void efface();
    public abstract void retireProduit(Produit produit);
    public abstract EtatCommande etatSuivant();

}