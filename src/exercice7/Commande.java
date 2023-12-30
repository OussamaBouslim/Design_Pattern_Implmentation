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
import java.util.*;
public class Commande
{
    protected List<Produit> produits = new ArrayList<Produit>();
    protected EtatCommande etatCommande;
    
       public Commande()
    {
        etatCommande = new CommandeEnCours(this);
    }
        public void ajouteProduit(Produit produit)
            {
            etatCommande.ajouteProduit(produit);
            }
        public void retireProduit(Produit produit)
            {
            etatCommande.retireProduit(produit);
            }
        public void efface()
            {
            etatCommande.efface();
            }
        public void etatSuivant()
            {
            etatCommande = etatCommande.etatSuivant();
            }
        public List<Produit> getProduits()
            {
            return produits;
            }
        public void affiche()
            {
            System.out.println("Contenu de la commande");
            for (Produit produit: produits)
            produit.affiche();
            System.out.println();
        }
       }
