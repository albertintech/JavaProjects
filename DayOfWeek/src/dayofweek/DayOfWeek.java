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
        int day = 5;
        String dayName = "";
        
        if (day == 1) {
            dayName = "Monday";
        }
        if (day == 2) {
            dayName = "Tuesday";
        }
        if (day == 3) {
            dayName = "Wednesday";
        }
        if (day == 4) {
            dayName = "Thursday";
        }
        if (day == 5) {
            dayName = "Friday";
        }
        if (day == 6) {
            dayName = "Saturday";
        }
        if (day == 7) {
            dayName = "Sunday";
        }
        
        System.out.println("This day is " + dayName);
        
    }
    
}
