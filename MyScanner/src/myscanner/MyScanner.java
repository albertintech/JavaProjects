/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscanner;
import java.util.Scanner;

/**
 *
 * @author albert
 */
public class MyScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "";
        String hometown = "";
        
        int age = 0;
        int numComputers = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        name = myScanner.nextLine();
        
        System.out.println("Please enter your age:");
        age = myScanner.nextInt();
        
        System.out.println("How many computers do you own?");
        numComputers = myScanner.nextInt();
        myScanner.nextLine();
        
        System.out.println("Please enter your hometown:");
        hometown = myScanner.nextLine();
        
        

        System.out.println("Hi " + name + "! Your age is " + age + ".");
        System.out.println("You are from " + hometown + ".");
        System.out.println("And own " + numComputers + " computers. Nice!");
    }
    
}
