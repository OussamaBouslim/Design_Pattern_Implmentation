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
public interface FabriqueVehicule {
     Automobile creerAutomobile(String modele, String couleur, int puissance, double espace);
     Scooter creerScooter(String modele, String couleur, int puissance);
}
