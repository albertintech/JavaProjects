/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofweek;
/**
 * This program illustrates the constructs if-else and switch
 * @author albert
 */
public class DayOfWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day = 6;
        String dayName = "";
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "an Invalid day";
                   
        }
        
//        if (day == 1) {
//            dayName = "Monday";
//        } else if (day == 2) {
//            dayName = "Tuesday";
//        } else if (day == 3) {
//            dayName = "Wednesday";
//        } else if (day == 4) {
//            dayName = "Thursday";
//        } else if (day == 5) {
//            dayName = "Friday";
//        } else if (day == 6) {
//            dayName = "Saturday";
//        } else if (day == 7) {
//            dayName = "Sunday";
//        } else {
//            dayName = "Oops! The hard-coded value is not between 1 and 7!";
//        }
        
        System.out.println("This day is " + dayName);
        
        if(dayName.equals("Saturday") || dayName.equals("Sunday")) {
            System.out.println("It is the weekend! Enjoy!");
        } else {
            System.out.println("It is a weekday. Bummer.");
        }
        
    }
    
}
