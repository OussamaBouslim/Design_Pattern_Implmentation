/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice4;

/**
 *
 * @author H-R
 */
public class Journalisation {

    private static Journalisation instance;
    private StringBuilder logs;

    private Journalisation() {
        this.logs = new StringBuilder();
    }

    public static Journalisation getInstance() {
        if (instance == null) {
            instance = new Journalisation();
        }
        return instance;
    }

    public void ajouterLog(String message) {
        logs.append(message).append("\n");
    }

    public String getLogs() {
        return logs.toString();
    }
}
