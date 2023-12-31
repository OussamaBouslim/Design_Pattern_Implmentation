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
public class Main {
    
        public static void main(String[] args) {
        String region = "Italy"; 

        // Create the region factory
        PizzaFactory pizzaFactory = RegionFactory.createRegionFactory(region);

      
        Pizza fromagePizza = pizzaFactory.createPizza("Fromage");
        fromagePizza.prepare();
        fromagePizza.bake();
        fromagePizza.cut();
        fromagePizza.box();

        
    }
    
}
