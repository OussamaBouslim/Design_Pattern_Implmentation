/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice9_Memento;

/**
 *
 * @author H-R
 */
import java.util.*;



public class OptionVehicule
{
 protected String nom;
 protected List<OptionVehicule> optionsIncompatibles = new ArrayList<OptionVehicule>();
 
 
 public OptionVehicule(String nom)
 {
    this.nom = nom;
 }
 public void ajouteOptionIncompatible(OptionVehicule optionIncompatible)
 {
        if (!optionsIncompatibles.contains(optionIncompatible))
    {
        optionsIncompatibles.add(optionIncompatible);
        optionIncompatible.ajouteOptionIncompatible(this);
    }
 }
 
 
    public List<OptionVehicule> getOptionsIncompatibles()
    {
        return optionsIncompatibles;
    }
    public void affiche()
    {
            System.out.println("option : " + nom);
    }
}
