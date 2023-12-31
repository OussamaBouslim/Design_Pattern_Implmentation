    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice6_Observer;

/**
 *
 * @author H-R
 */
public class VueVehicule implements Observateur
{
    protected Vehicule vehicule;
    protected String texte = "";
    
    
    public VueVehicule(Vehicule vehicule)
        {
        this.vehicule = vehicule;
            vehicule.ajoute(this);
        this.actualise();
        }
    
    
    public void actualise()
        {
        texte = "Description " + vehicule.getDescription()
        + " Prix : " + vehicule.getPrix();
        }
    
    
    public void affiche()
    {
         System.out.println(texte);
    }
  }

