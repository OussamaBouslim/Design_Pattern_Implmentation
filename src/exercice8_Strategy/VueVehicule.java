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
public class VueVehicule {
    
    protected String description;
    
    public VueVehicule(String description)
    {
        this.description = description;
    }
    public void dessine()
    {
        System.out.print(description);
    }
    
}
