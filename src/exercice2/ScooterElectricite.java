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
public class ScooterElectricite extends Scooter {

    private int autonomieBatterie;

    
    public ScooterElectricite(String modele, String couleur, int puissance, int autonomieBatterie) {
        super(modele, couleur, puissance);
        this.autonomieBatterie = autonomieBatterie;
    }

    
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter électrique :");
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " chevaux");
        System.out.println("Autonomie de la batterie : " + autonomieBatterie + " kilomètres");
    }
}
