/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2_abstractFactory;

/**
 *
 * @author H-R
 */
public class ScooterEssence extends Scooter {

    private int consommationCarburant;

    public ScooterEssence(String modele, String couleur, int puissance, int consommationCarburant) {
        super(modele, couleur, puissance);
        this.consommationCarburant = consommationCarburant;
    }

   
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter à essence :");
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " chevaux");
        System.out.println("Consommation de carburant : " + consommationCarburant + " litres par 100 km");
    }
}

