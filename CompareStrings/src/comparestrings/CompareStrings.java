/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparestrings;
import java.util.Scanner;
/**
 *
 * @author albert
 */
public class CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        int userNumber = 0;
        String userNumberString;
        
        do {
            
            System.out.println("Please enter a number between 1 and 20: ");
            userNumberString = keyboard.nextLine();
            userNumber = Integer.parseInt(userNumberString);
            
        } while ( userNumber < 1 || userNumber > 20 );
        
        System.out.println("Thank you. Your number was " + userNumber + ".");
    }
    
}
