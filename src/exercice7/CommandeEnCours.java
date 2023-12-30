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
public class CommandeEnCours extends EtatCommande
{
        public CommandeEnCours(Commande commande)
        {
        super(commande);
        }
            public void ajouteProduit(Produit produit)
            {
                commande.getProduits().add(produit);
            }
            public void efface()
            {
                commande.getProduits().clear();
            }
            public void retireProduit(Produit produit)
            {
                commande.getProduits().remove(produit);
            }
            public EtatCommande etatSuivant()
            {
                return new CommandeValidee(commande);
            }
}
