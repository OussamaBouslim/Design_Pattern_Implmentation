/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice3_singleton;

/**
 *
 * @author H-R
 */
public class Main {
     public static void main(String[] args) {
         
        Database database = Database.getInstance();

        database.editRecord("Nouvel enregistrement");

        System.out.println("Nom de la base de données : " + database.getName());

        System.out.println("Enregistrement actuel : " + database.getRecord());
    }
}

