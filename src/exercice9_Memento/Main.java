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
public class Main {
    
    
    public static void main(String[] args)
 {
        Memento memento;
        OptionVehicule option1 = new OptionVehicule("Sièges en cuir");
        
        OptionVehicule option2 = new OptionVehicule("Accoudoirs");
        
        OptionVehicule option3 = new OptionVehicule( "Sièges sportifs");
        
        
        option1.ajouteOptionIncompatible(option3);
        option2.ajouteOptionIncompatible(option3);
        
        
        ChariotOption chariotOptions = new ChariotOption();
        chariotOptions.ajouteOption(option1);
        chariotOptions.ajouteOption(option2);
        chariotOptions.affiche();
        memento = chariotOptions.ajouteOption(option3);
        chariotOptions.affiche();
        chariotOptions.annule(memento);
        chariotOptions.affiche();
 }
    
}
