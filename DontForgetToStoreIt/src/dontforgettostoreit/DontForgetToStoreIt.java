/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontforgettostoreit;
import java.util.Scanner;
/**
 *
 * @author albert
 */
public class DontForgetToStoreIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals:");
        pi = Double.parseDouble(inputReader.nextLine());
        
        System.out.println("What is the meaning of life, " +
                "the universe, and everything?");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is your favorite kind of cheese?");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more?");
        color = inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " +
                ( 2 * pi * meaningOfLifeAndEverything) + ".");
    }
    
}
