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
public class Database {
    private static Database instance;
    private String record;
    private String name;

    private Database() {
        this.record = "";
        this.name = "MaBaseDeDonnees";
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void editRecord(String newRecord) {
        this.record = newRecord;
    }

    
    public String getName() {
        return this.name;
    }

    
    public String getRecord() {
        return this.record;
    }
}