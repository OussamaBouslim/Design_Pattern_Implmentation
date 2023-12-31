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
public class AutomobileElectricite extends Automobile {

    private int autonomieBatterie;

 
    public AutomobileElectricite(String modele, String couleur, int puissance, double espace, int autonomieBatterie) {
        super(modele, couleur, puissance, espace);
        this.autonomieBatterie = autonomieBatterie;
    }

  
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Automobile électrique :");
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " chevaux");
        System.out.println("Espace : " + getEspace() + " mètres cubes");
        System.out.println("Autonomie de la batterie : " + autonomieBatterie + " kilomètres");
    }
}
