/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice9;

/**
 *
 * @author H-R
 */

import java.util.ArrayList;
import java.util.List;


public interface Memento {
    void setEtat(List<OptionVehicule> options);
     List<OptionVehicule> getEtat();
    
}
