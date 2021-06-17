/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author albert
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        
        //generate 10 numbers, each between 0 and 9 inclusive
        for (int i=0; i <= 10; i++)
        {
            int randomNumber = rng.nextInt(10) + 1;
            System.out.println(randomNumber);
        }
        
        //Randomly select a name from an array of names
        String[] names = new String[] { "Alice", "Bob", "Clarice", "David",
            "Elizabeth"
        };
        int randomIndex = rng.nextInt( names.length );
        String randomName = names[randomIndex];
        System.out.println("The winner is: " + randomName + "!");
        
        double randomValue = rng.nextDouble();
        boolean coinIsHeads = randomValue < 0.5;
        System.out.println("The coin flip is heads: " + coinIsHeads + ".");
    }
    
}
