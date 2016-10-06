/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import P2.ClassTwo;

/**
 *
 * @author Aravind.Babu
 */
public class ClassOne extends ClassTwo {
    //We can Access Protected methods from a class of a different package through INHERITANCE
    //So here i am extending ClassOne with ClassTwo and adding the necessary imports for PackageTwo

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Creating a new instance of the ClassOne object and 
       //invoking Protected method "ShowMe" from package2 using dot operator
       
        new ClassOne().ShowMe();//it is same as ClassOne Obj1 = new ClassOne();
                                //              Obj1.ShowMe();     
                                
       //invoking Protected method "Display" from package2 using dot operator
       new ClassOne().Display();
    }
    
}
