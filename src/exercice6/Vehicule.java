/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice6;

/**
 *
 * @author H-R
 */
public class Vehicule extends Sujet
{
    protected String description;
    protected Double prix;
    
    
    public String getDescription()
     {
        return description;
     }
    public void setDescription(String description)
    {
        this.description = description;
        this.notifie();
    }
    public Double getPrix()
    {
        return prix;
    }
    public void setPrix(Double prix)
    {
        this.prix = prix;
        this.notifie();
    }
}
