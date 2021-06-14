/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofweek;
/**
 *
 * @author albert
 */
public class DayOfWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day = 2;
        String dayName = "";
        
        if (day == 1) {
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        } else if (day == 4) {
            dayName = "Thursday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Saturday";
        } else if (day == 7) {
            dayName = "Sunday";
        } else {
            dayName = "Oops! Hard coded value is not between 1 and 7!";
        }
        
        System.out.println("This day is " + dayName);
        
    }
    
}
