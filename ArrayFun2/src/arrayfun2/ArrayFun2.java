/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun2;

/**
 *
 * @author albert
 */
public class ArrayFun2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[]{3, 5, 2, 0};
        
        System.out.println("Starting...");
        
        for (int ctr = 0; ctr < numbers.length; ctr++) {
            System.out.println("ctr = " + ctr + " Numbers = "
            + numbers[ctr]);
        }
        System.out.println("Done!");
    }
    
}
