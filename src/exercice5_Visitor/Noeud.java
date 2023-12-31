/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice5_Visitor;

/**
 *
 * @author H-R
 */
public interface Noeud {
    
    void accept(VisiteurArbre visiteur);
    
}
