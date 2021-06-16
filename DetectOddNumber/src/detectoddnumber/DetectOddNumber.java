/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectoddnumber;
import java.util.Scanner;
/**
 * 
 * 
 * @author albert
 * 
 * Based on a pseudocode example from page 197 of "Job Ready Java"
 * I was able to code the branching logic just fine, but setting
 * up a loop to test for an integer was a challenge. Fortunately,
 * I found the perfect video on YouTube to help me set up a Try-
 * Catch block: https://youtu.be/dW-aWDLV44c
 * 
 */
public class DetectOddNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stringInput = "";
        int userNumber = 0;
        boolean valid = false;
        boolean odd = false;
        
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //This while loop tests for a valid integer value or throws exception
        do
        {
            try
            {
                System.out.print("Please enter an odd integer value: ");
                stringInput = keyboard.nextLine();
                userNumber = Integer.parseInt(stringInput);
                if (userNumber % 2 == 0)
                {
                    System.out.println("You did not enter an odd integer. Try again.");
                } else if (userNumber % 2 == 1){
                    System.out.println("You entered " + userNumber + ", an odd number.");
                    valid = true;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error. Please enter an integer value.");
            }
        } while (valid == false);
    }
    
}
