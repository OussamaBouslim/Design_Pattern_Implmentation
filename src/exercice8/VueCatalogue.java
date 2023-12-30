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


public class VueCatalogue
{
    protected List<VueVehicule> contenu =new ArrayList<VueVehicule>();
    protected DessinCatalogue dessin;
    
    
    public VueCatalogue(DessinCatalogue dessin)
 {
    contenu.add(new VueVehicule("véhicule bon marché"));
    contenu.add(new VueVehicule("véhicule spacieux"));
    contenu.add(new VueVehicule("véhicule rapide"));
    contenu.add(new VueVehicule("véhicule confortable"));
    contenu.add(new VueVehicule("véhicule sportif"));
    this.dessin = dessin;
 }
    
    
 public void dessine()
 {
     dessin.dessine(contenu);
 }
}

