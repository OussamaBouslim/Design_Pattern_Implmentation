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
public class FabriqueVehiculeEssence implements FabriqueVehicule {

    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileEssence(modele, couleur, puissance, espace, 0);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterEssence(modele, couleur, puissance, 0);
    }
}

