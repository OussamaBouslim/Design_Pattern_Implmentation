/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

/**
 *
 * @author H-R
 */
public abstract class Scooter {
    private String modele;
    private String couleur;
    private int puissance;

   
    public Scooter(String modele, String couleur, int puissance) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
    }

   
    public abstract void afficherCaracteristiques();

   
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
