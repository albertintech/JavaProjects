/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passtheturingtest;
import java.util.Scanner;
/**
 *
 * @author albert
 */
public class PassTheTuringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userName = "";
        String aiName = "Alice";
        String favColor = "";
        String favFood = "";
        
        Scanner keyboard = new Scanner(System.in);
        //ask for user name
        System.out.println("What is your name:");
        userName = keyboard.nextLine();
        
        //display user name and reveal ai name
        System.out.println("Hello, " + userName + ". My name is " + aiName + ".");
        System.out.println("Nice to meet you!");
        
        //ask for user fav color
        System.out.println("What is your favorite color?");
        favColor = keyboard.nextLine();
        //display color in coversational way
        System.out.println("Really?! What a conincidence since " + favColor
                + " is my favorite color too!");
        
        //ask for user fav food
        System.out.println("What is your favorite food?");
        favFood = keyboard.nextLine();
        
        //display fav food in a conversation way and say goodbye
        System.out.println("You're the first person I've met that likes " + favFood + "!");
        System.out.println("My favorite food is chilaquiles. In fact, I'm going to order some "
        + "from my favorite spot right now. Bye!");
        
        
    }
    
}
