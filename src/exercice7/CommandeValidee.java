/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice7;

/**
 *
 * @author H-R
 */
public class CommandeValidee extends EtatCommande
{
        public CommandeValidee(Commande commande)
     {
            super(commande);
     }
        public void ajouteProduit(Produit produit){}
        
        public void efface()
        {
            commande.getProduits().clear();
        }
        public void retireProduit(Produit produit){}
        
        public EtatCommande etatSuivant()
        {
            return new CommandeLivree(commande);
     }
}

