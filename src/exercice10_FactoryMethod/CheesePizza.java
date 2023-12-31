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
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Préparation de la pizza au fromage");
    }

    @Override
    public void bake() {
        System.out.println("Cuisson de la pizza au fromage");
    }

    @Override
    public void cut() {
        System.out.println("Découpage de la pizza au fromage");
    }

    @Override
    public void box() {
        System.out.println("Mise en boîte de la pizza au fromage");
    }
}
    

