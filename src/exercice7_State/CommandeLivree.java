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
public class CommandeLivree extends EtatCommande
{
    public CommandeLivree(Commande commande)
    {
        super(commande);
    }
    public void ajouteProduit(Produit produit){}
    
    public void efface(){}
    
    public void retireProduit(Produit produit){}
    
    public EtatCommande etatSuivant()
    {
        return this;
    }
}
