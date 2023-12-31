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
public interface VisiteurArbre {
    
    void visiter(NoeudPlus noeudPlus);
     
    void visiter(NoeudMoins noeudMoins);
    
    void visiter(NoeudValeur noeudValeur);
    
}
