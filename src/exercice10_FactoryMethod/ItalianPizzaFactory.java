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
public class ItalianPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Fromage")) {
            pizza = new CheesePizza();
        } else if (type.equals("FruitsDeMer")) {
            pizza = new SeafoodPizza();
        } else if (type.equals("Végétarienne")) {
            pizza = new VegetarianPizza();
        }

        return pizza;
    }
}
    

