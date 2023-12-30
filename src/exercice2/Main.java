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
public class Main {

    public static void main(String[] args) {

        
        FabriqueVehicule fabriqueElectrique = new FabriqueVehiculeElectricite();

        Automobile automobileElectrique = fabriqueElectrique.creerAutomobile("Model E", "Rouge", 200, 10.5);
        Scooter scooterElectrique = fabriqueElectrique.creerScooter("ScootE", "Bleu", 30);

       
        System.out.println("Caractéristiques de l'automobile électrique :");
        automobileElectrique.afficherCaracteristiques();

        System.out.println("\nCaractéristiques du scooter électrique :");
        scooterElectrique.afficherCaracteristiques();

       
        FabriqueVehicule fabriqueEssence = new FabriqueVehiculeEssence();

        Automobile automobileEssence = fabriqueEssence.creerAutomobile("Model A", "Noir", 150, 8.0);
        Scooter scooterEssence = fabriqueEssence.creerScooter("ScootA", "Vert", 25);

       
        System.out.println("\nCaractéristiques de l'automobile à essence :");
        automobileEssence.afficherCaracteristiques();

        System.out.println("\nCaractéristiques du scooter à essence :");
        scooterEssence.afficherCaracteristiques();
    }
}
