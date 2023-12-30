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
public class Main {
    
     public static void main(String[] args)
 {
        VueCatalogue vueCatalogue1 = new VueCatalogue(new
        DessinTroisVehiculesLigne());
        vueCatalogue1.dessine();
        VueCatalogue vueCatalogue2 = new VueCatalogue(new
        DessinUnVehiculeLigne());
        vueCatalogue2.dessine();
 }
    
}
