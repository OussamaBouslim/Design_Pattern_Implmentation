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
public class AlgerianPizzaFactory implements PizzaFactory {
    
    
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Fromage")) {
         
        } else if (type.equals("FruitsDeMer")) {
           
        } else if (type.equals("Végétarienne")) {
         
        }

        return pizza;
    }

    
}
