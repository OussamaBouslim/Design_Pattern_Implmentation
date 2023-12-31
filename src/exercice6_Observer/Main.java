/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice6_Observer;

/**
 *
 * @author H-R
 */
public class Main {
    public static void main(String[] args)
 {
        Vehicule vehicule = new Vehicule();
        vehicule.setDescription("Véhicule bon marché");
        vehicule.setPrix(5000.0);
        VueVehicule vueVehicule = new VueVehicule(vehicule);
        vueVehicule.affiche();
        vehicule.setPrix(4500.0);
        vueVehicule.affiche();
        VueVehicule vueVehicule2 = new VueVehicule(vehicule);
        vehicule.setPrix(5500.0);
        vueVehicule.affiche();
        vueVehicule2.affiche();
 }
}
