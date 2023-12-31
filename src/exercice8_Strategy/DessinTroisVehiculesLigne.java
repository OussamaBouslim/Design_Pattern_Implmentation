/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice8_Strategy;

/**
 *
 * @author H-R
 */
import java.util.*;
public class DessinTroisVehiculesLigne implements
        DessinCatalogue
        {
            public void dessine(List<VueVehicule> contenu)
         {
            int compteur;
            System.out.println("Dessine les véhicules avec trois véhicules par ligne");
            compteur = 0;
            for (VueVehicule vueVehicule: contenu)
            {
            vueVehicule.dessine();
            compteur++;
            if (compteur == 3)
            {
                System.out.println();
                compteur = 0;
            }
            else
                System.out.print(" ");
            }
            if (compteur != 0)
                System.out.println();
                System.out.println();
            }
}

