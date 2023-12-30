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
public class Produit
{
    protected String nom;
    
    public Produit(String nom)
    {
        this.nom = nom;
    }
    public void affiche()
    {
        System.out.println("Produit : " + nom);
    }
}
