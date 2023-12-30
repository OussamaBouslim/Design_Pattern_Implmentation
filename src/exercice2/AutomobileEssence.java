/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

/**
 *
 * @author H-R
 */
public class AutomobileEssence extends Automobile {

    private int consommationCarburant;

   
    public AutomobileEssence(String modele, String couleur, int puissance, double espace, int consommationCarburant) {
        super(modele, couleur, puissance, espace);
        this.consommationCarburant = consommationCarburant;
    }

  
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Automobile à essence :");
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " chevaux");
        System.out.println("Espace : " + getEspace() + " mètres cubes");
        System.out.println("Consommation de carburant : " + consommationCarburant + " litres par 100 km");
    }
}
