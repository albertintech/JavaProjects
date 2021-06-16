/*
* Tradional Fizz Buzz Program
* Ask the user for a number.
* Use a for loop to count from zero, replacing every multiple of 3
* with fizz and every multiple of 5 with buzz.Multiples of both
* should print out fizz buzz.
* Every time you print out fizz, buzz, or fizz buzz, keep track.
* When you reach the number recieved from the user, stop.
* Finish with an all-caps printout of "TRADITIONAL!!!"
*/
package fizzbuzz;
import java.util.Scanner;
/**
 *
 * @author albert
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userNumber = 0;
        int counter;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a whole number: ");
        userNumber = keyboard.nextInt();
        System.out.println("You entered: " + userNumber + ".");
        System.out.println("Away we go!");
        
        for (counter = 1; counter <= userNumber; counter++)
        {
            
            if (counter % 15 == 0) {
                System.out.println("Meow");
            }
            
            else if (counter % 5 == 0) {
                System.out.print("Buzz" + " ");
            }
            
            else if (counter % 3 == 0) {
                System.out.print("Fizz" + " ");
            }
            else System.out.print(counter + " ");
            
        }
        
        System.out.println("TRADITIONAL!!!");
    }
    
}
