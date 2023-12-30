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


public class MementoImpl implements Memento
{
    protected List<OptionVehicule> options = new ArrayList<OptionVehicule>();
    
    public void setEtat(List<OptionVehicule> options)
    {
        this.options.clear();
        this.options.addAll(options);
    }
    
    public List<OptionVehicule> getEtat()
    {
        return options;
    } 
}