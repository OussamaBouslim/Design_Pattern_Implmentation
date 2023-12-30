/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

/**
 *
 * @author H-R
 */
public class ProgrammeFactory {
    
    public static ProgrammeInterface getProgramme(int programNumber){
        
         switch (programNumber) {
            case 1:
                System.out.println("Je suis le main1");
                return new Programme1();
               
            case 2:
                System.out.println("Je suis le main2");
                return new Programme2();
                
            case 3:
                System.out.println("Je suis le main3");
                return new Programme3();
            case 4:
                System.out.println("Je suis le main4");
                return new Programme4();
              
            default:
                System.out.println("Invalid program number. Please provide 1, 2, or 3.");
         
        }
        return null;
    }
    
}
