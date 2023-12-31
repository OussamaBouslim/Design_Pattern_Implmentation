/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice10_FactoryMethod;

/**
 *
 * @author H-R
 */
public class RegionFactory {
    
    public static PizzaFactory createRegionFactory(String region) {
        if (region.equals("Italy")) {
            return new ItalianPizzaFactory();
        } else if (region.equals("Algeria")) {
            return new AlgerianPizzaFactory();
        }

        return null;
    }
}
