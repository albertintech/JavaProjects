/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questfortheuserinput;
import java.util.Scanner;
/**
 *
 * @author albert
 */
public class QuestForTheUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        System.out.println("What is your name?");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?");
        yourQuest = inputReader.nextLine();
        
        System.out.println("What is the airspeed velocity of an uladen swallow?!");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        
        System.out.println("How do you know " + velocityOfSwallow +
                " is correct, " + yourName + "?");
        System.out.println("You didn't even know if the swallow was " +
                "African or European!");
        System.out.println("Maybe skip answering things about birds " +
                "and instead go " + yourQuest + ".");
                
    }
    
}
