/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowmasterrefactor;
import java.util.Scanner;
/**
 *
 * @author albert
 */
public class WindowMasterRefactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner keyboard = new Scanner(System.in);

//        Refactor: A new method was created to encompass the following
//        prompts in harmony with the DRY principle
//
//        System.out.println("Please enter window height: ");
//        stringHeight = keyboard.nextLine();
//        System.out.println("Please enter window width: ");
//        stringWidth = keyboard.nextLine();
        
        height = readValue("Please enter window height: ");
        width = readValue("Please enter window width: ");
        
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
    
    public static float readValue (String prompt) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(prompt);
        String input = keyboard.nextLine();
        float floatVal = Float.parseFloat(input);
        
        return floatVal;
    }
    
}
