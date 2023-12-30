/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice8;

/**
 *
 * @author H-R
 */
import java.util.*;
public class DessinUnVehiculeLigne implements DessinCatalogue
   {
    public void dessine(List<VueVehicule> contenu)
    {
        System.out.println("Dessine les véhicules avec un véhicule par ligne");
        for (VueVehicule vueVehicule: contenu)
    {
        vueVehicule.dessine();
        System.out.println();
    }
        System.out.println();
    }
}

