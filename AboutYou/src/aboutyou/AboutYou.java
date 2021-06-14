/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aboutyou;

/**
 *
 * @author albert
 */
public class AboutYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 17;
        boolean registered = true;
        
        //See if a person can vote!
        if( age >= 18 && registered == true) {
            System.out.println("You can vote!");
        }
        
        //See if they are not allowed to vote!
        if( age < 18 || registered != true) {
            System.out.println("You must be at least 18 years old to vote.");
        }
    }
    
}
